// Loops => run over and over again until a condition is met

// Infinite loops => these loops never ends, consitions is never reached

// Finite loops => terminte when a condition is met

// For loops

function printValues(startValue, endValue) {
  for (let i = startValue; i <= endValue; i++) {
    console.log(i);
  }
}

printValues(0, 7);

let array = [0, 1, 2, 3, 4, 5];

function addValuesToArray(startValue, endValue) {
  for (let i = startValue; i <= endValue; i++) {
    array.push(i);
  }

  console.log(array);
}

addValuesToArray(6, 10);

// While loops

let i = 0;
// while (i <= 5) {
//   console.log(i);
//   i++;
// }

while (true) {
  if (i == 6) {
    break;
  }
  console.log(i);
  i++;
}

// Loops with arrays

let fruitsArray = ['Apples', 'Mangoes', 'Oranges', 'Pineapples'];

for (let i = 0, arrayLength = fruitsArray.length; i < arrayLength; i++) {
  console.log(fruitsArray[i]);
}
