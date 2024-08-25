function main() {
    let num = parseInt(prompt("Enter number which you want for Factorial: "));
    let fact = 1;

    for (let i = 1; i <= num; i++) {
        fact = fact * i;
    }

    console.log(`Factorial of ${num} is ${fact}`);
}

// Calling the main function to execute
main();
