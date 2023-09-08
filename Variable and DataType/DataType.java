public class DataType {
    public static int xpown(int x, int Bit) {
        int result=0;
        if (Bit==1) {
            return 1;
        }
        return x * xpown(x,Bit-1);
    }

    public static void main(String[] args) {

        // For Checking dataType Range use below statement
        // System.out.println(xpown(2,8));

        // Byte DataType
        byte a = 115;   // Range -128 to 127    Size 1 byte
        byte b = 12;
        byte c = (byte) (a + b);
        System.out.println("Byte DataType : "+c);

        // Short DataType
        short d = 32767;    // Range -32768 to 32767    Size 2 byte
        short e = 10;
        short f = (short)(d + e);
        System.out.println("Short DataType : "+e);

        // Literal and default math value is taken as a int type datatype
        // Int DataType
        int num1 = 45;      // Range -3B to 3B      Size 4 byte
        int num2 = 12;
        int sum = num2 + num1;
        System.out.println("Int DataType : "+sum);

        // Double DataType
        double o = 342.1123456712343D;  // After dot 13 Value allowed to use
        System.out.println("Double DataType : "+o);    // Size 8 byte

        // Float DataType
        float g = 342.1123456712343F;   // After dot 5 Value allowed to use
        System.out.println("Float DataType : "+g);      // Size 4 byte

        // Long datatype
        long l1 = 1231223423;   // Longest Integer value it has
        System.out.println("long DataType : "+l1);

        // Char DataType
        char chr = 'a';
        char chr1 = 'B';
        char result = (char) (chr + chr1);
        System.out.println("Char DataType : "+result);
    }
}