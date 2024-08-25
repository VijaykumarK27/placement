var num = 12321;
var rev = 0;
var temp = num;
var rem;

while (num > 0) {
    rem = num % 10;
    rev = (rev * 10) + rem;
    num = Math.floor(num / 10);  // Corrected division to integer division
}

if (rev === temp) {
    console.log("Palindrome number");
} else {
    console.log("Not palindrome number");
}
