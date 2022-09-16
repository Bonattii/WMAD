// Write a funciton that prints the sum of 2 numbers (a, b)

// Declaration of the function
function sum(a, b) {
  console.log(a + b);
}

// Function call
sum(4, 5);

// Concatenation of strings, with name as a paramater.
function greetUser(name) {
  console.log(`My name is ${name}`);
}

greetUser('Rodrigo');

// Write a function that give the area of the circle

function areaOfCircle(radius) {
  console.log(`The area of the circle is ${Math.PI * radius ** 2}`);
}

areaOfCircle(2);

// Returning values

function myName(name) {
  return `Hi ${name}`;
}

let output = myName('Rodrigo');
console.log(output);

// Create multiple variables in 1 line

let a = 4,
  b = 5,
  c = 7;

// More of returning values

function areOfCircle1(radius) {
  return Math.PI * radius ** 2;
}

let areaTimesTwo = areOfCircle1(4) * 2;
console.log(areaTimesTwo);

// Returning arrays

function getLongLat(long, lat) {
  return [long, lat];
}

function getDistance(long) {
  console.log(long);
}

let longLat = getLongLat(100, 200);
getDistance(longLat);
