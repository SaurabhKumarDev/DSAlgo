import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Use Single Operator.\n-> ");
        String str = sc.next();

        int i=0;
        for (i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                int a = Integer.parseInt(str.substring(0, i));
                int b = Integer.parseInt(str.substring(i+1, str.length()));

                switch (ch) {
                    case '+' :
                        System.out.println("Sum : "+(a+b));
                        break;
                    case '-' :
                        System.out.println("Sub : "+(a-b));
                        break;
                    case '*' :
                        System.out.println("Mul : "+(a*b));
                        break;
                    case '/' :
                        float c = b;
                        System.out.println("Div : "+(a/c));
                        break;
                    case '%' :
                        System.out.println("Modulus : "+(a%b));
                        break;
                    default:
                        System.out.println("Didn't find operator");
                }
            }
        }
    }
}