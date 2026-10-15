fun reverseWords(s: String): String {
    val chars = s.toCharArray()
    val n = chars.size
    var start = 0

    for (end in 0..n) {
        if (end == n || chars[end] == ' ') {
            var left = start
            var right = end - 1
            while (left < right) {
                val tmp = chars[left]
                chars[left] = chars[right]
                chars[right] = tmp
                left++
                right--
            }
            start = end + 1
        }
    }
    return String(chars)
}

fun main() {
    println(reverseWords("Let's take LeetCode contest")) // s'teL ekat edoCteeL tsetnoc
    println(reverseWords("Mr Ding"))                      // rM gniD
}
