/**Operators in JS */

let num1 = 10.7;
let num2 = 15.9;

console.log(parseFloat(num1 + num2));

// Assignment Operator

// Arithematic Operator

// More Arithmetic Operators

// Augumented Assignment Operators

// Logical Operator

let sub1 = 90;
let sub2 = 60;
let sub3 = 40;
let average = (sub1 + sub2 + sub3) / 3;
console.log(average);

let eligibleForAward;
let english = 15;
let maths = 50;
let science = 93;
let eligibleForScholarship;
let eligibleForScienceFair;
let count = 0;

if (english > 80) count++;
if (maths > 80) count++;
if (science > 80) count++;

console.log(average);

eligibleForScholarship = count === 2 ? true : false;

console.log(eligibleForScholarship);

eligibleForScienceFair = english + maths + science > 250 ? true : false;

console.log(eligibleForScienceFair);

eligibleForAward =
  eligibleForScholarship || eligibleForScienceFair ? true : false;

console.log(eligibleForAward);
