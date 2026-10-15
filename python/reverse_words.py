def reverse_words(s):
    chars = list(s)
    n = len(chars)
    start = 0

    for end in range(n + 1):
        if end == n or chars[end] == " ":
            left, right = start, end - 1
            while left < right:
                chars[left], chars[right] = chars[right], chars[left]
                left += 1
                right -= 1
            start = end + 1

    return "".join(chars)


if __name__ == "__main__":
    print(reverse_words("Let's take LeetCode contest"))  # s'teL ekat edoCteeL tsetnoc
    print(reverse_words("Mr Ding"))                       # rM gniD
