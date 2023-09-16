// try to done at O(n) Complexity
/*
* Output :
* *
* **
* ***
* ****
*/
public class StarPattern {
    public static void printPattern(int n){
        // Write your code here.
        String str = "*";
        for (int i=1; i<=n; i++) {
            System.out.println(str);
            str += "*";
        }
    }

    public static void main(String[] args) {
        printPattern(4);
    }
}
