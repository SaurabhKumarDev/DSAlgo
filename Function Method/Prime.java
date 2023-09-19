public class Prime {

    // Check if number is prime or not
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else if (n == 2){
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    // Optimized way to find prime
    public static Boolean Prime(int n) {
        if (n == 1) {
            return false;
        } else if (n == 2){
            return true;
        }

        // Math.sqrt(n) = UnderRoot N; UnderRoot N * UnderRoot N = N So half it to minimize the complexity
        // 1*6
        // 2*3
        // 3*2
        // 6*1

        for (int i=2; i<(n/2); i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }


    // Print all Prime number
    public static void printPrime(int first, int last) {
        for (int n=first; n<=last; n++) {
            if(isPrime(n) == true) {
                System.out.print(n+"  ");
            }
        }
    }

    public static void main(String[] args) {
        printPrime(1,20);
    }
}
