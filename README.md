[![Instagram](https://img.shields.io/badge/Instagram-lacopydepastel-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://instagram.com/lacopydepastel)
[![YouTube](https://img.shields.io/badge/YouTube-%40rvorine-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://youtube.com/@rvorine)

# Reverse Words in a String III (LeetCode 557)

## Problem

Given string `s`, reverse the characters of **each word** while keeping whitespace and the original word order unchanged.

Example:

```
Input:  "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Input:  "Mr Ding"
Output: "rM gniD"
```

## Solution

Two pointers — find each word's boundaries, then reverse that slice in place.

1. Copy the string into a character array (strings are immutable in most languages).
2. Walk `end` from `0` to `n` (one past the last index). `start` marks where the current word begins.
3. When `end` hits a space, or the end of the string, the slice `[start, end - 1]` is one complete word. Reverse it with a classic `left`/`right` swap loop.
4. Set `start = end + 1` so the next word begins right after the space.

Spaces are never moved and word order never changes — only the letters inside each word flip.

**Time:** O(n) — every character is visited and swapped at most once.
**Space:** O(n) for the character array (the reversal itself is in place, O(1) extra).

## Implementations

| Language | File |
|---|---|
| Python | [`python/reverse_words.py`](python/reverse_words.py) |
| Java | [`java/ReverseWords.java`](java/ReverseWords.java) |
| Kotlin | [`kotlin/ReverseWords.kt`](kotlin/ReverseWords.kt) |
| JavaScript | [`javascript/reverseWords.js`](javascript/reverseWords.js) |
| C# | [`csharp/ReverseWords.cs`](csharp/ReverseWords.cs) |
