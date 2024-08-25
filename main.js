function main(){
    let num1 = 0;
    let num2 = 1;
    let num = 10;
    for(let i=0;i<=num;i++){
        console.log(num1+"");
        let num3 = num2+num1;
        num1 = num2;
        num2 = num3;
    }
    console.log()
}
main();