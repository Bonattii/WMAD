// How to make an array

let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9];

// The other way (Class Array)

let collegeList = new Array('Cornerstone', 'UCW', 'VCC');

// Add values inside the array (PUSH METHOD)

// A method is a function attached to different types od data structures

numbers.push(10);
collegeList.push('Langara'); // Push returns the lenght!!

// Add values per index

collegeList[4] = 'UBC';

// Size of the array

console.log(numbers.length);

// POP method (returns the value that was removed)

numbers.pop();
console.log(numbers);

// SHIFT method remove the value on the first index
// UNSHIFT method insert the value on the first index
// SPLICE method insert a value on any index or remove the value
// SLICE method returns the part of the array

// Inplace methods changes the original array and Not Inplace don't change the original array and just create a new one (assign to a variable)
