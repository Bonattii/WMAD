let array = [1, 3, 5, 6];

// while loops

// while (count < array.length) {
//   console.log(array[count]);
//   count++;
// }

// do While loops

// do {
//   console.log(array[count]);
//   count++;
// } while (count < array.length);

// for of loop

for (let num of array) {
  console.log(num);
}

// forEach

// array.forEach(function (num) {
//   console.log(num);
// });

// for in loop

let student = {
  name: 'David',
  age: 20
};

let instructor = {
  name: 'Rodrigo',
  college: 'CICCC',
  hobbies: ['Read', 'Dance'],
  address: {
    city: 'Vancouver',
    province: 'BC'
  },
  study: function () {
    console.log('Rodrigo is a great student!');
  }
};

for (let key in instructor) {
  console.log(key);
  console.log(instructor[key]);
}
