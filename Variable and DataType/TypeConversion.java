public class TypeConversion {
    public static void main(String[] args) {

        // byte->short->int->float->long->double
        // byte -> short,int,float,long,double
        // float -> long,double

        // Byte to int
        byte b = 123;
        int i = b+3;
        System.out.println(i);

        // Long to short
        // lossy conversion because long to short means
        // Large_space data is transferring  to Short_space and that's not possible that's why it is lossy conversion
        long l = 123456;

        // It's give error - Lossy Conversion
//        short s = l;
//        System.out.println(s);

        float f = 12.89f;
        double d = f;
        System.out.println(d);
    }
}
