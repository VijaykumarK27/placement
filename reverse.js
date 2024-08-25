function main() {
    let str = "India is country My";
    let strArray = str.split(" ");
    let ans = "";

    for (let i = strArray.length - 1; i >= 0; i--) {
        ans += strArray[i] + " ";
    }

    // Trim the extra space at the end and print the result
    console.log(ans.trim());
}

// Calling the main function to execute
main();
