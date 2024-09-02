// Variables - let, const and var

// let will allow u to change the value after initialization at any point
let x = 10;
const y = 9;
x = y;
console.log(x);
console.log(y);

// const is unchangeable
const dob = 12;
const liveContent = "mkbhd";

// var should be used as per requirement
var myName = "Jeevan";
myName = 10;

// Data Types

// PRIMITIVE DATA TYPES :

// Number (64 bit)
let num = 10;
console.log(typeof num);

// String
const firtName = "Jeevan";
const lastName = "Dabbi";
const nickName = `JD`;

console.log(typeof firtName);
console.log(typeof lastName);
console.log(typeof nickName);

// Boolean
let bool = false;
console.log(typeof bool);

// Undefined
let a;
console.log(typeof a);
console.log(a);

//Null

let b = null;
console.log(b);
console.log(typeof b);

// BIG INT - ends with 'n'
let bigNumber = 10n;
console.log(bigNumber);
console.log(typeof bigNumber);
console.log(Number.MAX_SAFE_INTEGER, Number.MIN_SAFE_INTEGER);
console.log(Number.MAX_SAFE_INTEGER * Number.MAX_SAFE_INTEGER);

// Infinity -  concepts of Math Infinity apply here as well

let testNumber = Infinity;
console.log(testNumber);
console.log(100 / testNumber);
console.log(Infinity / 100);
console.log(Number.MAX_VALUE * Number.MIN_VALUE);

console.log(
  "=======End Of Primitive Data Types===================================================================="
);
