import java.util.Scanner;

public class SumOfFirstNNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), sum=0;
        for (int i=1; i<=x; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
