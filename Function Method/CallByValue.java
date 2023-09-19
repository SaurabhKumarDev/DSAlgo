public class CallByValue {
    // In call by value method, the value of the actual parameters is copied into the formal parameters.

    // Example :- Swap

    // Copied the actual parameter value only
    // Doing their job within the function
    // No Changed in actual parameter after execution of this function
    // This is a Call By Value
    public static void Swap (int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of A : "+a);
        System.out.println("Value of B : "+b);
    }

    public static void main(String[] args) {
        // Actual Parameter Value of A and B
        int a = 5, b = 10;

        Swap(a,b);
        System.out.println("Value of A after function : "+a);
        System.out.print("Value of B after function : "+b);
    }
}