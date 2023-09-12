public class TypeCasting {
    public static void main(String[] args) {
        // Type Conversion is also known as Narrowing and Explicit
        // Changing any dataType forcefully

        // double->float->long->int->short->byte
        
        // Float to int
        float f = 99.67f;
        int i = (int) f;
        System.out.println(i);

        // float to long
        long l = (long) f;
        System.out.println(l);
    }
}
