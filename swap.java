public class swap {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        System.out.println("Before Swap: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    
}
