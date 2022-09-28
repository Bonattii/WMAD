// 1 - Check if the array is sorted in descending or ascending order

function checkIfArrayIsSorted(array) {
  let sortedAscending = true;
  let sortedDescending = true;

  // Check the size of the array to see if its worth to run the rest of the function
  if (array.length < 2) {
    return 'Array is too small';
  }

  for (let i = 0, length = array.length - 1; i < length; i++) {
    if (sortedAscending) {
      sortedAscending = array[i] <= array[i + 1];
    }
    if (sortedDescending) {
      sortedDescending = array[i] >= array[i + 1];
    }
    // If discover that isn't sorted before the end of the array than break the loop
    // Then we don't waste time looping
    if (sortedDescending == false && sortedAscending == false) {
      break;
    }
  }

  if (sortedAscending || sortedDescending) {
    return true;
  } else {
    return false;
  }
}

let arraySmall = [2];
let arrayAscending = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let arrayDescending = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1];
let arrayNotSorted = [1, 3, 2, 5, 4, 7, 9, 8, 6, 10];
// console.log(checkIfArrayIsSorted(arraySmall));

// The Big O Notation for the quesiton number 1 is O(n)
//
//
//
//
//
// 2 - Check if have duplicate numbers in a sorted array

function haveDuplicatesInSortedArray(array) {
  let length = array.length;
  let aux = array[0];
  for (let i = 1; i < length; i++) {
    if (array[i] === aux) {
      return true;
    }
    aux = array[i];
  }
  return false;
}

let arrayWithNoDuplicatesQ2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let arrayWithDuplicatesQ2 = [1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10];
// console.log(haveDuplicatesInSortedArray(arrayWithNoDuplicatesQ2));

// The Big O Notation for the question number 2 is O(n)
//
//
//
//
//
//
//
// 3 - Check if have duplicates in an array not sorted

function haveDuplicatesInArray(array) {
  length = array.length;
  for (let i = 0; i < length; i++) {
    for (let j = 0; j < length; j++) {
      // This if makes that the element don't compare with itself
      if (i !== j) {
        if (array[i] === array[j]) {
          return true;
        }
      }
    }
  }
  return false;
}

let arrayWithNoDuplicatesQ3 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let arrayWithDuplicatesQ3 = [1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10];
// console.log(haveDuplicatesInArray(arrayWithDuplicatesQ3));

// The Big O Notation for the question number 3 is O(n^2);
