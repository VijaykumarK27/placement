import java.util.Scanner;
public class space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String input = sc.nextLine();
        System.out.println("Original String- " + input);
        input = input.replaceAll("\\s", "");
        System.out.println("Final String-" + input);
    }

    
}
