// Default Parameters

function sum(num1 = 0, num2 = 0) {
   console.log(`Sum : ${num1 + num2}`);
}
sum(1, 2);
sum();
sum(1);

// With return value

function square(number = 0, sqaureValue = 1) {
   return Math.pow(number, sqaureValue);
}
let value = square(10, 5);
console.log(value);

//LastDigit
function lastDigit(num1, num2) {
   num1.toString().charAt(num1.toString().length - 1) ===
      num2.toString().charAt(num2.toString().length - 1);
}

lastDigit(29, 89);

const commonDigits = (num1, num2) => {
   console.log(Math.floor(num1 / 10));
   return num1.toString().length === num2.toString().length;
};

console.log(commonDigits(23243, 842349));

const septemberBatch = ["John", "Mark", "CJ", "Arthur"];
const octoberBatch = ["John", "Mark", "CJ", "Arthur"];
const novemberBatch = ["John", "Mark", "CJ", "Arthur"];
const decemberBatch = ["John", "Mark", "CJ", "Arthur"];

function addNewStudent(batchName, studentName) {
   batchName.push(studentName);
   console.log(batchName);
}

addNewStudent(septemberBatch, "Jeevan");
addNewStudent(novemberBatch, "Ajay");
addNewStudent(decemberBatch, "KJ");

// Rest Operator

function addNewStudentWithRest(batchName, ...studentName) {
   for (let i of studentName) {
      batchName.push(i);
   }
   console.log(batchName);
}

addNewStudentWithRest(septemberBatch, "Jeevan", "AD");
addNewStudentWithRest(novemberBatch, "Jeevan", "AD");
addNewStudentWithRest(decemberBatch, "Jeevan", "AD");

// Spread Operator -  Shallow copying

const newBatch = [...novemberBatch];
console.log(novemberBatch);
console.log(newBatch);

novemberBatch.push("Raja");

console.log(novemberBatch);
console.log(newBatch);

// Concatinate

const mergedBatch = [...octoberBatch, ...novemberBatch];
console.log(mergedBatch);

//function mergeArray
arr1 = [1, 2, 4, 5, 7];
arr2 = [3, 4, 6, 7, 9, 0];

function mergeArray(arr1, arr2) {
   const uniqueElements = new Set([...arr1, ...arr2]);
   return Array.from(uniqueElements);
}
console.log(mergeArray(arr1, arr2));
//Expected Output : [1,2,4,5,7,3,6,9,0]

// Problem
const numbersArr = [1, 6, 8, 3, 5, 20, 10];
function sumOfArrays(arr) {
   let sum = 0;
   for (let i of arr) {
      if (i % 2 === 0 && i % 5 !== 0) {
         sum += i;
      }
   }
   return sum;
}
console.log(sumOfArrays(numbersArr));

// String Traversing

let str = "Javascript is an important language for web development.";
const words = str.split(" ").length;
console.log(words);

let letterCount = 0;
for (let i = 0; i < str.length; i++) {
   if (str.charAt(i).toLowerCase() == "a") letterCount++;
}
console.log(`Occurence is letter 'a' : ${letterCount}`);

// More String Methods :

//includes()
console.log(str.includes("iS"));

//replace() -> Replaces First occurence
console.log(str.replace("Java", "JAVA"));

//replaceAll() -> Replces all the occurences

//trim() -> Remove leading and trailing spaces

//subString() ->
console.log(str.substring(10, 20));
console.log(str.substring(-10)); // Negative value will be converted into a string

// slice()

console.log(str.slice(3, 20));
console.log(str.slice(-30, -1));
