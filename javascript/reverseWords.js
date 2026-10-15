function reverseWords(s) {
  const chars = s.split("");
  const n = chars.length;
  let start = 0;

  for (let end = 0; end <= n; end++) {
    if (end === n || chars[end] === " ") {
      let left = start, right = end - 1;
      while (left < right) {
        [chars[left], chars[right]] = [chars[right], chars[left]];
        left++;
        right--;
      }
      start = end + 1;
    }
  }
  return chars.join("");
}

console.log(reverseWords("Let's take LeetCode contest")); // s'teL ekat edoCteeL tsetnoc
console.log(reverseWords("Mr Ding"));                      // rM gniD

module.exports = { reverseWords };
