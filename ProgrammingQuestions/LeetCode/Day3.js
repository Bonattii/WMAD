// Question 3 (MONDAY) - given strings s and t return true if t is an anagram
// of s, and false otherwise

var isAnagram = function (s, t) {
  // Straight Forward Solutions

  if (s.length !== t.length) {
    return false;
  }

  let leftString1 = s.toLowerCase();
  let rightString1 = t.toLowerCase();

  leftString1 = leftString1.split('').sort().join('');
  rightString1 = rightString1.split('').sort().join('');
  return leftString1 == rightString1;
};
