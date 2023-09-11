public class TernaryOperator {
    public static void main(String[] args) {
        /* Ternary Operator */
        // ((Condition)? true:false)
        // Also Known as "Short-hand if-else" or "Other type of if-else"

        // If-else - One line of Code - Odd and Even
        System.out.println((4%2==0)? "Even" : "Odd");

        // Else if by using ternary operator
        // Greater between three number
        int a=22, b=14, c=6;
        int result = (a>=b && a>=c)? a: (b>=a && b>=c)? b : c;
        System.out.println(result);
    }
}
