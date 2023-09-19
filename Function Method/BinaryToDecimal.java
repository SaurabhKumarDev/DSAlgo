public class BinaryToDecimal {
    public static void main(String[] args) {

        int binary = 10001000;

        int count = -1, result = 0;
        while (binary > 0) {
            count++;
            int rem = binary%10;
            result = result + (rem) * ((int) Math.pow(2, count));
            binary /= 10;
        }
        System.out.print(result);
    }
}
