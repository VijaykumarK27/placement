public class swapex {
    public static void main(String[] args) {
        int a=2,b=3;

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After swapping : a = "+ a + " and b = "+b);
    }
}
