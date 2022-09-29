// JavaScript sort embeed function don't works as we want
// So we need to write a logic for the funciton works "properly"

// By Ascending number order
function numberCompare(num1, num2) {
  return num1 - num2;
}

// If return negative, should go before, if positive after

let numList = [6, 4, 15, 10].sort(numberCompare);
// console.log(numList);

// Is important to SWAP to Sort (MUST)

function swap(array, index1, index2) {
  let tempVar = array[index1];
  array[index1] = array[index2];
  array[index2] = tempVar;
}

/* OR */

function swap1(array, index1, index2) {
  [array[index1], array[index2]] = [array[index2], array[index1]];
}

/* BUBBLE SORT */

function bubbleSort(array) {
  for (let i = array.length - 1; i >= 0; i--) {
    for (let j = 0; j < i - 1; j++) {
      if (array[j] > array[j + 1]) {
        swap1(array, i, j);
      }
    }
  }
  return array;
}
// O(n^2) Worst and O(n) Best
console.log(bubbleSort(numList));

/* SELECTION SORT */

function selectionSort(array) {
  for (let i = 0; i < array.length; i++) {
    let smallerElement = i;

    for (let j = i + 1; j < array.length; j++) {
      if (array[j] < array[smallerElement]) {
        smallerElement = j;
      }
    }

    if (smallerElement !== i) {
      swap1(array, i, smallerElement);
    }
  }

  return array;
}
// O(n^2) Worst and O(n^2) Best
console.log(selectionSort(numList));

/* INSERTION SORT */

function insertionSort(array) {
  // Starting from the second element
  for (let i = 1; i < array.length; i++) {
    let currentElement = array[i];
    let j = 0;

    // While the element before exists and is bigger than the current
    for (j = i - 1; j >= 0 && array[j] > currentElement; j--) {
      swap1(array, i, j);
    }

    array[j + 1] = currentElement;
  }
  return array;
}
// O(n^2) Worst and O(n) Best
console.log(insertionSort(numList));
