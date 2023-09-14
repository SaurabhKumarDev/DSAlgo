public class PrintSquarePattern {
    public static void main(String[] args) {
        int n = 4, i=1;
        while (i <= n) {
            int j=1;
            while (j <= n) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
