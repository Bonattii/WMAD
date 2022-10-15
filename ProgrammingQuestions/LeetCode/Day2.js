// Question 2 (FRIDAY) - Given an aray of nums and a target , return indices
// of the two numbers such their sum is the target

// Brute force solution

var twoSum = function (nums, target) {
  for (let i = 0; i < nums.length; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[i] + nums[j] === target) {
        return [i, j];
      }
    }
  }
};

// Better solution

var twoSum = function (nums, target) {
  let myObj = {};
  let indexArr = [];

  for (let i = 0; i < nums.length; i++) {
    let diff = target - nums[i];

    if (myObj[diff] !== undefined) {
      indexArr.push(i);
      indexArr.push(myObj[diff]);
    }

    myObj[nums[i]] = i;
  }

  return indexArr;
};
