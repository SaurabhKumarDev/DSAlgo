public class Unary {
    public static void main(String[] args) {

        int a = 10;

        // In unary Operator = 1. Pre-Increment or Decrement, 2. Post-Increment or Decrement

        // Pre Increment ++a
        int b = ++a;    // b = a = a + 1    ->  a=11;

        // Pre Decrement --a
        int c = --a;    // a=10;

        // Post Increment a++
        int d = a++;    // a=11     'd' use the first value of 'a' means 10 after processing it a = a+1

        // Post Decrement a--
        int e = a--;    // a=10     e=a=11
    }
}
