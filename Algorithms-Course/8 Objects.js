// Is a type of data structure where we sabe value in the form
// of key and value pairs

// Student Rodrigo

let rodrigo = {
  name: 'Rodrigo',
  courseStudying: 'WMAD',
  age: 20,
  address: {
    city: 'Vancouver',
    province: 'BC',
    zipCode: 'V6G 2H8',
    apartment: 1806
  },
  study: () => console.log('Rodrigo is an awesome student')
};

// Access items inside an object

// 1. Dot operator
// console.log()
// console.error()
// console.table()
// array.pop()

console.log(rodrigo.name);
console.log(rodrigo.address.city);
rodrigo.study();

// 2. [ ]

console.log(rodrigo['name']);
console.log(rodrigo['address']['city']);
rodrigo['study']();

// You can ad properties on objects using DOT
