public class PrintCharacterPattern {
    public static void highComplexity(int n) {
        char ch = 'A';
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void lowComplexity (int n, char ch) {
        String str = "A";
        for (int i=1; i<=n; i++) {
            System.out.println(str);
            ch++;
            String temp = String.valueOf(ch);
            str += temp;
        }
    }

}
