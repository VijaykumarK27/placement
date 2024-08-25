function main() {
    let sum = 0, res, temp;
    let num = 153; // It is the number to check Armstrong
    temp = num;

    while (num > 0) {
        res = num % 10;
        num = Math.floor(num / 10); // Integer division in JavaScript
        sum = sum + (res * res * res);
    }

    if (temp === sum) {
        console.log(temp + " is Armstrong number");
    } else {
        console.log(temp + " is Not Armstrong number");
    }
}

// Calling the main function to execute
main();
