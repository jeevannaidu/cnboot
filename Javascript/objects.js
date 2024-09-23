// Object in Javascript
// Use curly braces to create an object
// Key -> by default string type but we can give an number/ boolean/ Decimal Value also
// Value -> Can be string/number/ boolean/ Decimal and we can also put an function

const student = {
   Name: "Alex",
   Age: 23,
   Hobby: "Dancing",
   100: "hundred",
   false: "false",
   0.01: "floating Point",
   show: function () {
      console.log("Above contains the student details"); // No Definintion functions are anonymous functions
      return "ABC";
   },
};

// dot notation
student.show();
console.log(student.Name);

// bracket notation"
console.log(student["Name"]);
console.log(student.show()); // Prints the log inside the method call and prints the returned value as well

const value = student.show();
console.log(value);
student.number = 37890349;
console.log(student);

// Problem
const std = {
   secA: {
      std1: {
         Name: "Sumanth",
         Age: 26,
      },

      std2: {
         Name: "Prudhivi",
         Age: 26,
      },
   },

   secB: {
      std1: {
         Name: "Jeevan",
         Age: 26,
      },

      std2: {
         Name: "Naidu",
         Age: 26,
      },
   },
};

console.log(std["secA"]["std2"]["Age"]);
console.log(std.secB.std2.Age);

// Difference for object handling and array handling with for loop

const obj = {
   a: 1,
   b: 2,
   c: 3,
};
for (const i in obj) {
   console.log(i); // Output : a,b,c (Keys)
}

const alpha = ["a", "b", "c"];
for (let i in alpha) {
   console.log(i); // Output : 0,1,2 (Index numbers no data will be displayed)
}

// Problem
const arr = [23, 43, 67, 89, 62, 29];
let answer = arr.includes(62) ? arr.indexOf(62) : -1;
console.log(answer);

//String Reverse
let str = "Reverse Javascript";
str = str.split("").reverse().join("");
console.log(str);

// Calculate cart items

const goods = {
   apple: { price: 150, quantity: 2 },
   banana: { price: 75, quantity: 3 },
   orange: { price: 125, quantity: 1 },
};

function calculatePrice(goods) {
   let total = 0;
   for (let i in goods) {
      total += goods[i].price * goods[i].quantity;
   }
}
console.log(calculatePrice(goods));
