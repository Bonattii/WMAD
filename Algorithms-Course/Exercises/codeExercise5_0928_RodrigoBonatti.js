// 1 - Write a function to find the index of the value in the 2D Array

let numList = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
];

function findIndex(array, target) {
  // Check if the array is bigger than 0
  if (array.length === 0) {
    return -1;
  }

  let length = array.length;

  for (let i = 0; i < length; i++) {
    for (let j = 0; j < length; j++) {
      if (array[i][j] === target) {
        return [i, j];
      }
    }
  }

  // If the value is not found
  return -1;
}

console.log(findIndex(numList, 6));

// The Big O Notation of question 1 is O(n^2)

// 2 - Write a function that takes a string, and capitalizes every first letter of the word

let string = 'hello world';

function capitalize(str) {
  let arrayOfWords = str.split(' ');
  let length = arrayOfWords.length;

  for (let i = 0; i < length; i++) {
    arrayOfWords[i] =
      arrayOfWords[i].charAt(0).toUpperCase() + arrayOfWords[i].substr(1);
  }

  return arrayOfWords.join(' ');
}

console.log(capitalize(string));

// The Big O Notation for the question 2 is O(n);

// 3 - Make a Binary Search with recursion

let sortedNumList = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let beginOfArray = 0;
let endOfArray = sortedNumList.length - 1;

function binarySearch(array, target, start, end) {
  while (start <= end) {
    let middle = Math.floor((start + end) / 2);

    if (array[middle] === target) {
      return middle;
    } else if (array[middle] < target) {
      return binarySearch(array, target, middle + 1, end);
    } else {
      return binarySearch(array, target, start, middle - 1);
    }
  }
}

console.log(binarySearch(sortedNumList, 8, beginOfArray, endOfArray));

// The Big O Notation for the question 3 is O(log(n))
