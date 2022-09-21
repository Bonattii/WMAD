// Question 1

function printOddNumbers(n) {
  for (let i = 0; i <= n; i++) {
    if (i % 2 == 1) {
      console.log(i);
    }
  }
}

printOddNumbers(30);

// Question 2

function sumOfElements(array) {
  let sum = 0;

  for (let i = 0, length = array.length; i < length; i++) {
    sum += array[i];
  }

  return sum;
}

let array = [1, 2, 4, 31, 14, 14, 14231, 167623];
let arraySum = sumOfElements(array);

console.log(arraySum);

// Question 3

// Going to use the same array used on question 2

function largestNumber(array) {
  let largest = array[0];

  for (let i = 0, length = array.length; i < length; i++) {
    if (largest < array[i]) {
      largest = array[i];
    }
  }

  return largest;
}

let arrayLargestNumber = largestNumber(array);
console.log(arrayLargestNumber);

// Alternative to question 3

console.log(Math.max(...array));
