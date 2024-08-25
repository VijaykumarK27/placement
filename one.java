import java.util.Scanner;
public class one{
    public static void main(String[]args){
        int a,b,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");

        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before swapping\na="+a+"\nb="+b);
        temp = a;
        a =b ;
        b=temp;
        System.out.println("After swapping\na="+a+"\nb="+b);

    }

}