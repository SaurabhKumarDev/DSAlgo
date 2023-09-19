public class Assignment {
    public static float average(int a, int b, int c) {
        float avg = (a+b+c)/3;
        return avg;
    }
    public static boolean isEven(int n) {
        return (n%2 == 0)? true : false;
    }
    public static boolean  palindrome(int n) {
        int reverse = 0, num = n;
        while (num>0) {
            int rem = num%10;
            reverse = (reverse * 10) + rem;
            num /= 10;
        }
        return (n == reverse)? true : false;
    }
    public static void method() {
        int a = 8, b = 9;
        double d = 45;                              // toRadians need double type of dataType
        System.out.println("Minimum : "+Math.min(a,b));
        System.out.println("Maximum : "+Math.max(a,b));
        System.out.println("Square root : "+Math.sqrt(a));
        System.out.println("Power : "+Math.pow(a,b));       //a^b
        System.out.println("Absolute : "+Math.abs(8.9));
        double c = Math.toRadians(d);               // Used to convert an angle measured in degrees
        System.out.println("Sin : "+Math.sin(c));   // Trignometric table
        System.out.println("Tan : "+Math.tan(c));
    }
    public static int SumOfDigit(int n) {
        if (n == 1) { return 1; }
        return n + SumOfDigit(n-1);
    }
}