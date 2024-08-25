function main() {
    let a = 100, b = 200;
    console.log(`After swapping, a = ${a} and b = ${b}`);

    // 1. Swapping using three Variables
    let temp = a;
    a = b;
    b = temp;
    console.log(`After swapping, a = ${a} and b = ${b}`);

    // 2. Using Two Variables
    a = a + b;
    b = a - b;
    a = a - b;
    console.log(`After swapping, a = ${a} and b = ${b}`);

    // 3. Swapping a and b using XOR
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    console.log(`After swapping, a = ${a} and b = ${b}`);
}

// Calling the main function
main();
