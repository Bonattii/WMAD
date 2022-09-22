// Question 1

function printInversePyramid(n) {
  let stars = '*';
  for (let i = n; i > 0; i--) {
    console.log(stars.repeat(i));
  }
}

printInversePyramid(12);

// Question 2

function printIncreaseDecrease(n) {
  let stars = '*';
  for (let i = 1; i < n; i++) {
    console.log(stars.repeat(i));
  }
  for (let i = n; i > 0; i--) {
    console.log(stars.repeat(i));
  }
}

printIncreaseDecrease(5);

// Question 3

function printTriangleBorder(n) {
  let stars = '*';
  let stringSpaces = ' ';
  let spacesAroundQuantity = n;
  let spacesInMiddle = 1;
  for (let i = 1; i <= n; i++) {
    if (i == 1) {
      console.log(stringSpaces.repeat(spacesAroundQuantity) + stars.repeat(i));
    } else if (i > 1 && i < n) {
      console.log(
        stringSpaces.repeat(spacesAroundQuantity) +
          stars +
          stringSpaces.repeat(spacesInMiddle) +
          stars
      );
      spacesInMiddle += 2;
    } else if (i == n) {
      console.log(
        stringSpaces.repeat(spacesAroundQuantity) + stars.repeat(i * 2 - 1)
      );
    }

    spacesAroundQuantity--;
  }
}

printTriangleBorder(20);
