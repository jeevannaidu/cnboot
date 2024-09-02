// Wrapper object gets created when we declare and initialize a primitive data type

let demoString = "      JavaScript is a good programing language   ";
console.log(demoString.__proto__);
console.log(demoString.charAt(10));
console.log(demoString.charAt(1).concat(demoString.charAt(4)));
console.log(demoString.length);
console.log(demoString.indexOf("a"));
console.log(demoString.trim());
console.log(demoString.trimStart());
console.log(demoString.includes("z"));
console.log(demoString.indexOf("a", 15));
console.log(demoString.charAt(20));
console.log(demoString.lastIndexOf("a"));
console.log(demoString.replaceAll("a", "A").trimStart());
console.log("This is reapeat : ", demoString.repeat(5));
console.log(demoString.search("not"));
console.log(demoString.includes("lan"));
console.log(demoString.substring(20));
console.log(demoString.charAt(50));

console.log(
  "=======End Of Console Log========================================================================"
);
