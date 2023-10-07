import java.util.Arrays;

public class Creation {
    public static void main(String[] args) {
        int arrInt[] = new int[2];
        String arrString[] = new String[4];
        char[] ch = {'a','b','c'};

        // Inserting value's
        arrInt[0] = 2;
        arrInt[1] = 2;

        arrString[0] = "4";
        arrString[3] = "Four";
        arrString[2] = "two";

        ch[2] = 'd';

        // Output
        System.out.println(Arrays.toString(arrString));
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(ch));
    }
}