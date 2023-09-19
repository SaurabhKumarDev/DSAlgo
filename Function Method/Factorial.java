public class Factorial {
    // 5! = 5*4*3*2*1
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        // Here, I used Recursion for multiple the value of n with n-1
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.print(factorial(5));
    }
}
