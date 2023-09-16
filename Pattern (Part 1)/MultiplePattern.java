public class MultiplePattern {

    public static void invertedHalf(int n) {
        for (int i=1; i<=n; i++) {
            int num = 1;
            for (int j=1; j<=n-i+1; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public static void floydTriangle(int n) {
        int num = 1;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public static void rhombus(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=n; k++) {
                if ((i==1) || (i==n) || (k==1) || (k==(n-1))) System.out.print("*");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void butterfuly(int n) {
        String str = "*";
        for (int i=1; i<=n; i++) {
            System.out.print(str);
            for (int k=1; k<=(n-i)*2; k++) {
                System.out.print(" ");
            }
            System.out.print(str);
            str += "*";
            System.out.println();
        }
        for (int i=n; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int k=1; k<=(n-i)*2; k++) {
                System.out.print(" ");
            }
            for (int l=1; l<=i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=((2*i)-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n-1; i>=1; i--) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=((2*i)-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int n) {
        for (int i=1; i<=n; i++) {
            int num = 1;
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void palindromic(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int k=i; k>=1; k--) {
                System.out.print(k);
            }
            for (int l=2; l<=i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

}