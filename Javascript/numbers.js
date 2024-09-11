// Prime Number

function primeOrNot(number) {
   let isPrime = true;
   for (let i = 2; i < num; i++) {
      if (num % i === 0) isPrime = false;
   }

   if (isPrime) console.log("Is a prime number");
}

let num = prompt("Enter a number : ");
primeOrNot(num);

// Composite number

function compositeOrNot(number) {
   let count = 0;
   for (let i = 1; i <= number; i++) {
      if (number % i === 0) count++;
   }
   alert(count > 2 ? "Is a composite number" : "Not a composite number");
}

let num2 = prompt("Number to check if it is composite or not");
compositeOrNot(num2);

// Compound Interest

function compoundInterest(principalAmount, annualInterestRate, numberOfYears) {
   let answer;

   answer =
      principalAmount * Math.pow(1 + annualInterestRate / 1, 1 * numberOfYears);
   console.log(answer);
   return answer;
}

compoundInterest(500, 0.08, 5);

// Prime numbers from 2 to 100

for (let num = 2; num <= 100; num++) {
   let isPrime = true;
   for (let i = 2; i < num; i++) {
      if (num % i === 0) isPrime = false;
   }

   if (isPrime) console.log(num);
   isPrime = true;
}

let x = 0;
if (x++) {
   console.log("1");
} else if (x == 0) {
   console.log(x);
} else {
   console.log("Error");
}
