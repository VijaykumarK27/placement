import java.util.Scanner;
public class SwapingNumber{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        System.out.println("Before Swaping:");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("/nAfter Swaping:");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        scanner.close();
    }

}