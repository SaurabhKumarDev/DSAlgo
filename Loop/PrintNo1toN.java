import java.util.Scanner;

public class PrintNo1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(), i=1;
        while (i <= num) {
            System.out.println(i);
            i++;
        }
    }
}
