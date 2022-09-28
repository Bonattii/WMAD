// Linear Search

let numList = [10, 20, 40, 50, 11, -10, 30, 5];

function searchElement(array, target) {
  // Corner cases
  if (array.length === 0) {
    return -1;
  }

  for (let i = 0; i < array.length; i++) {
    if (array[i] === target) {
      return i;
    }
  }

  // Generally when we talk about indexes, if the values is not found we return -1
  return -1;
}

const foundIndex = searchElement(numList, -10);
// console.log('Found Index for -10 is', foundIndex);

// FindIndex Method in JavaScript

let foundValue = numList.findIndex(val => {
  if (val === 50) {
    return true;
  }
});

// console.log(foundValue, 'Value');

// Find Method in JavaScript

let findMethod = numList.find(val => {
  if (val === 50) {
    return true;
  }
});

// console.log(findMethod, 'Method');

// IndexOF

let findIndexValue = numList.indexOf(50);
// console.log(findIndexValue, 'indexOf');

// Binary Search (works on sorted arrays)

let sortedNumList = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

function binarySearch(array, target) {
  let beginOfArray = 0;
  let endOfArray = sortedNumList.length - 1;

  while (beginOfArray <= endOfArray) {
    let middleOfArray = Math.floor((beginOfArray + endOfArray) / 2);

    if (array[middleOfArray] === target) {
      return middleOfArray;
    } else if (array[middleOfArray] < target) {
      beginOfArray = middleOfArray + 1;
    } else {
      endOfArray = middleOfArray - 1;
    }
  }
}

console.log(binarySearch(sortedNumList, 8));
