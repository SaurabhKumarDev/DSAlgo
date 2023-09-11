import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Salary : ");
        int income = sc.nextInt(), tax = 0;

        if (income < 500000) {
            tax = (income/100) * 0;
        } else if (income >= 500000 && income <= 1000000) {
            tax = (income/100) * 20;
        } else {
            tax = (income/100) * 30;
        }

        System.out.println("Tax : "+tax);
    }
}
