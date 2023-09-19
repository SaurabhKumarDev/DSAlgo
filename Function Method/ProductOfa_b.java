public class ProductOfa_b {

    // Created function
    //  Name = product
    //  Parameter = a and b = Formal Parameter
    //  Return type = int
    public static int product (int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {
        int a = 5, b = 10;

        // product function called in main function for use
        // Passes the argument or actual parameter
        System.out.print("Product : "+product(a, b));
    }
}
