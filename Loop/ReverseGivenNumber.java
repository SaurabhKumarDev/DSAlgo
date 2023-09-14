public class ReverseGivenNumber {
    public static void main(String[] args) {
        int x = 2345, reverse=0;
        while (x>0) {
            int lastDigit = x%10;
            reverse = (reverse * 10) + lastDigit;
            x /= 10;
        }
        System.out.println(reverse);
    }
}
