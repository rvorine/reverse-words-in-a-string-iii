public class ReverseWords {

    static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int start = 0;

        for (int end = 0; end <= n; end++) {
            if (end == n || chars[end] == ' ') {
                int left = start, right = end - 1;
                while (left < right) {
                    char tmp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = tmp;
                    left++;
                    right--;
                }
                start = end + 1;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest")); // s'teL ekat edoCteeL tsetnoc
        System.out.println(reverseWords("Mr Ding"));                      // rM gniD
    }
}
