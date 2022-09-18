// Question 1

function displayTheLargerNumber(a, b) {
  a > b ? console.log(a) : console.log(b);
}

displayTheLargerNumber(4, 2);

// Question 2

function printEvenNumbers() {
  for (let i = 0, n = 10; i <= n; i++) {
    if (i % 2 == 0 && i != 0) {
      console.log(i);
    }
  }
}

printEvenNumbers();

// Question 3

function checkIfStringHaveY(string) {
  let haveY = 0;
  let stringAux = string.toLowerCase();

  for (let i = 0, length = stringAux.length; i < length; i++) {
    if (stringAux.charAt(i) === 'y') {
      haveY = 1;
      break;
    }
  }

  haveY == 1 ? console.log('yes') : console.log('no');
}

checkIfStringHaveY('asdfasd');

// Question 4

function calculateAverageOfScores(scores) {
  let sum = 0;
  let length = scores.length;

  for (let i = 0; i < length; i++) {
    sum += scores[i];
  }

  average = sum / length;

  if (average >= 90) {
    console.log('A');
  } else if (average >= 70 && average < 90) {
    console.log('B');
  } else if (average >= 50 && average < 70) {
    console.log('C');
  } else {
    console.log('F');
  }
}

calculateAverageOfScores([100, 70, 40, 50]);
