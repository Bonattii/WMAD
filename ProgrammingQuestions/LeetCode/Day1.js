// Question 1 (THURSDAY) - Write a function wich takes a parameter as an array
// where the values inside the array are from 0 ---> n, and you
// have to find a missing number

let array = [1, 4, 5, 2, 6, 8, 0, 10, 9, 7]; // 3 is missing

function findMissingNumber(arr) {
  //return missing number
  let n = arr.length;
  let totalSum = (n * (n + 1)) / 2;
  let sumOfArray = 0;

  for (let i of arr) {
    sumOfArray += i;
  }

  return totalSum - sumOfArray;
}

console.log(findMissingNumber(array));

// What I did is to sum the numbers on the real array and compare with
// the sum of the numbers until n
