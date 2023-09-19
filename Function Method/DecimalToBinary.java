public class DecimalToBinary {
    public static void main(String[] args) {
        int number = 7;
        int result = 0, count = 0;

        while (number > 0) {
            int rem = number%2;
            result = result + (rem * ((int) Math.pow(10, count)));
            count++;
            number /= 2;
        }
        System.out.print(result);
    }
}
