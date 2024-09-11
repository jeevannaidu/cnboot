console.log("FOR LOOP");
// For Loop

for (let i = 0; i < 5; i++) {
   console.log("Running the for loop");
}

//
let result = 0;
for (let i = 1; i <= 6; i++) {
   result = result + i;
}
console.log(result);

// Factorial
let sum = 1;
let limit = 6;

for (let i = 1; i <= limit; i++) {
   result *= i;
}
console.log(sum);

console.log("WHILE LOOP");
// While loop

let i = 1;
while (i <= 10) {
   console.log(i);
   i++;
}

console.log("DO WHILE LOOP");
// Do WHILE LOOP -  EXIT CONTROL LOOP

let randomNum = Math.round(Math.random() * 10);
console.log(randomNum);
let guessedNum;

do {
   guessedNum = prompt("Guess the number: ");
} while (guessedNum != randomNum);
