import java.util.Scanner;
public class ArmStrong {
    static int xpown (int x, int n) {
        if (n==0) {
            return 1;
        }
        return x * xpown(x, n-1);
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = Integer.parseInt(str);
        int res=0;

        for (int i=0; i<str.length(); i++) {
            int current = Character.getNumericValue(str.charAt(i));
            res = xpown(current, str.length()) + res;
        }

        System.out.print((res == num)? true : false);
    }
}
