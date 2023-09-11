public class LargestOf3Num {
    public static void main(String[] args) {

        int a=12, b=12, c=11;

        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= c && b>=a) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
