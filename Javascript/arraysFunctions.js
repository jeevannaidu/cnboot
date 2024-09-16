// CONST applies to only primitive data types

const cities = ["Visakhapatnam", "Hyderabad", "Bangalore"];
cities[2] = 10;
cities[2] = "Benguluru";
console.log(cities);

// Array operations

const phones = ["IPhone 16", "S24 Ultra"];

// Push - appends at the last and returns updated length
phones.push("Z Fold");

// Unshift - add element in the first and returns updated length
phones.unshift("Z Flip");

const newPhones = phones.unshift("Pixel 9 Pro XL");
console.log(newPhones);

// pop - removes the last element in the array and returns it
const phonesList = phones.pop();
console.log(phones);
console.log(phonesList);

// Shift - removes the first element in the array and returns it
phones.shift();
console.log(phones);

// Index of
console.log(phones.indexOf("S24 Ultra"));

// Includes
console.log(phones.includes("IPhone 16"));

// Slice - does not effect the main array makes a deep copy and returns the
// values based on the start and end indexes given
console.log(phones.slice(2));
console.log(phones);

// Splice - Takes three input in general (FIRST - Index to put the data, SECOND -
// Number of elements to be deleted, THIRD - Value/Element to be inserted)
phones.splice(2, 0, "Z Fold");
console.log(phones);
phones.splice(2, 1);
console.log(phones);

// Concat
const merged = phones.concat(cities);
console.log(merged);
console.log(phones);
console.log(cities);
s;
