using System;

class ReverseWords
{
    static string Solve(string s)
    {
        char[] chars = s.ToCharArray();
        int n = chars.Length;
        int start = 0;

        for (int end = 0; end <= n; end++)
        {
            if (end == n || chars[end] == ' ')
            {
                int left = start, right = end - 1;
                while (left < right)
                {
                    (chars[left], chars[right]) = (chars[right], chars[left]);
                    left++;
                    right--;
                }
                start = end + 1;
            }
        }
        return new string(chars);
    }

    static void Main()
    {
        Console.WriteLine(Solve("Let's take LeetCode contest")); // s'teL ekat edoCteeL tsetnoc
        Console.WriteLine(Solve("Mr Ding"));                      // rM gniD
    }
}
