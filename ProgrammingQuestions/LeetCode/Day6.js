// https://leetcode.com/problems/single-number/

// Uisng the XOR operator seems very simple

var singleNumber = function (nums) {
  let result = 0;
  for (let num of nums) {
    result ^= num;
  }
  return result;
};