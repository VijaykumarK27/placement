import java.util.Scanner;
public class integer{
    public static void main(String[] args) {
        int sum,x,y;
        System.out.println("Enter the integers:-");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
         sum = x + y;
         System.out.println("The Sum of two integers:"+sum);

    }
}