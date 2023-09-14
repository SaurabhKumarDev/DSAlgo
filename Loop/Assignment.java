import java.util.Scanner;

public class Assignment {

    static int fact(int n) {
        if (n == 0) { return 1; }
        return n * fact(n-1);
    }

    static void table(int n) {
        for (int i=1; i<=10; i++) {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1
        for (int i=0; i<5; i++) {
            System.out.println("Hello");
            i += 2;         // 0, 3     5<5 false
        }

        // Question 2
        //  Prints the sum of the even and odd integers
        int num = 5;
        int even = 0, odd = 0;
        for (int i=1; i<=num; i++) {
            if (i%2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.println(even+" "+odd);

        // Question 3
        // Factorial using function to reduce the complexity
        System.out.println(fact(num));

        // Question 4
        // table of N number
        table(num);
    }
}
