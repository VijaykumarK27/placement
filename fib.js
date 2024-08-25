function main() {
    let num1 = 0, num2 = 1;
    let num = 10; // Number of Fibonacci numbers to generate

    for (let i = 0; i <= num; i++) {
        process.stdout.write(num1 + " "); // Equivalent of System.out.print in Java

        let num3 = num2 + num1; // Calculate the next Fibonacci number
        num1 = num2;
        num2 = num3;
    }

    console.log(); // Move to the next line after printing the Fibonacci series
}

// Calling the main function to execute
main();
