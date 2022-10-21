// https://leetcode.com/problems/roman-to-integer/

var romanToInt = function (s) {
  const symbols = {
    I: 1,
    V: 5,
    X: 10,
    L: 50,
    C: 100,
    D: 500,
    M: 1000
  };

  let result = 0;

  for (let i = 0; i < s.length; i++) {
    const currentSymbol = symbols[s[i]];
    const nextSymbol = symbols[s[i + 1]];

    if (nextSymbol > currentSymbol) {
      result -= currentSymbol;
      continue;
    } else {
      result += currentSymbol;
    }
  }

  return result;
};
