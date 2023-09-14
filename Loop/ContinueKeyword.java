public class ContinueKeyword {
    public static void main(String[] args) {
        // dont print 10 ever
        int num = 19;
        for (int i=1; i<=num; i++) {
            if (i == 10) {
                continue;
            }
            System.out.println(i);
        }
    }
}
