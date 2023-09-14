import java.util.Scanner;

public class MultiplicationOf10 {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if (num%10 == 0) {
                break;
            }
            System.out.println(num);

        } while (true);
    }
}
