let emailId = prompt("Please enter an emaild Id");
let isValid =
   emailId.length > 11 &&
   emailId.substring(0, emailId.lastIndexOf("@")).length >= 3 &&
   emailId.substring(emailId.lastIndexOf(".") + 1, emailId.length).length <=
      3 &&
   emailId.substring(emailId.lastIndexOf("@") + 1, emailId.lastIndexOf("."))
      .length >= 4;
let message = isValid ? "Valid Email" : "not a valid email";
alert(message);
message.toLowerCase();

let answer;

let coffeeType = "Regular";

switch (coffeeType.toLowerCase()) {
   case "regular":
      answer = "$2.50";
      break;
   case "latte":
      answer = "$3.50";
      break;

   case "capppuccino":
      answer = "$4.00";
      break;

   case "espresso":
      answer = "$2.50";
      break;
   default:
      answer = "$0.00";
}

let num1 = 30;
let num2 = 20;
let num3 = 50;
let greatestNumber =
   num1 > num2 ? (num1 > num3 ? num1 : num3) : num2 > num3 ? num2 : num3;
console.log(greatestNumber);
//Difficult readability so avoid

for (let i = 0; i <= 5; i++) {
   console.log("Jeevan");
}
