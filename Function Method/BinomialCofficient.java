public class BinomialCofficient {
    /*
    * Bionomial Cofficient
    * C(n,r) = n! / (r! * (n-r)!)
    */

    static int factorial(int n) {
        if (n == 0) { return 1; }
        return n * factorial(n-1);
    }

    public static int bionomial(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nr_fact = factorial(n-r);

        return n_fact / (r_fact * nr_fact);
    }

    public static void main(String[] args) {
        System.out.print(bionomial(5, 2));
    }
}
