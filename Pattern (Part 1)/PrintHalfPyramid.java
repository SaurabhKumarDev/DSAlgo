// Time Complexity O(n)
// Used Variable(3), DataType Conversion (1), Loop(1)
/*
* Output :
* 1
* 12
* 123
* 1234
*/
public class PrintHalfPyramid {
    public static void main(String[] args) {
        int n = 4;
        String num = "1";
        int temp = 1;
        for (int i=1; i<=n; i++) {
            System.out.println(num);
            temp ++;
            String temperory = String.valueOf(temp);
            num += temperory;
        }
    }
}