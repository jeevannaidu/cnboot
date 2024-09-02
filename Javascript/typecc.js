/**Type Coercion - Implicit conversion*/
console.log(typeof (5 + 56859685));
console.log(typeof ("5" + 56859685));

let sub = "65" - 10;
console.log(typeof sub);

console.log(typeof ("5" * 9));
console.log(typeof ("45" * 9));

/**Type Conversion - Explicit conversion */

//Number to String

console.log(String(200).concat(String(121)));
console.log(String(null));
console.log(String(undefined));

// Null or Undefined cannot be converted into a string using toString method.

// String to a Number

console.log(Number("898"));
console.log(Number("898P"));
console.log(Number("89.8"));
console.log(Number("89.8pp"));
console.log(Number("String")); // NAN -  Not  number
console.log(Number(true)); // true -1 and false -2

// Unary operator --- works on variable

let number = "123";
console.log(+number);
console.log(typeof +"123");

// Parse Int -- Will display all the numbers in a string

console.log(parseInt("1234P5"));

// Parse Float

console.log(parseFloat("1P898.009P"));
