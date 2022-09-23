// When you a function is passed as a parameter to another function

function printName() {
  console.log('Rodrigo');
}

function greet(callBack) {
  callBack();
}

greet(printName);
