public class ReverseOfNumber {
    public static void main(String[] args) {
        int n = 3578;
        while (n > 0) {
            int reminder = n%10;
            System.out.print(reminder);
            n = n/10;
        }
    }
}
