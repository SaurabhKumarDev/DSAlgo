import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        * If you enter the out of range value , then it will give the error "Out of Range"
        */

        // Different Type of DataType INPUT from the user

        // Byte
        System.out.print("Byte : ");
        byte b = sc.nextByte();
        System.out.println("Byte : "+b);

        // Short
        System.out.print("Short : ");
        short s = sc.nextShort();
        System.out.println("Short : "+s);

        // Int
        System.out.print("Int : ");
        int i = sc.nextInt();
        System.out.println("Int : "+i);

        // Long
        System.out.print("Long : ");
        long l = sc.nextLong();
        System.out.println("Long : "+l);

        // Single Word
        System.out.print("String Single Word : ");
        String sW = sc.next();
        System.out.println("String Single Word : "+sW);

        /*
        * What occurs when we utilize the .next() and .nextLine() functions in conjunction with a message on the output screen?
        * It will collect both inputs simultaneously and subsequently display the message, as exemplified in this program.
        */

        // Multiple Word
        System.out.print("Complete Sentence : ");
        String mW = sc.nextLine();
        System.out.println("String Multiple Words : "+mW);

        // Float
        System.out.print("Float : ");
        float f = sc.nextFloat();
        System.out.println("Float : "+f);

        // Double
        System.out.print("Double : ");
        double d = sc.nextDouble();
        System.out.println("Double : "+d);

        // Boolean
        System.out.print("Boolean : ");
        boolean bool = sc.nextBoolean();
        System.out.println("Boolean : "+bool);

        // Char
        System.out.print("Char : ");
        char chr = sc.next().charAt(0);     // here this is the indexing of the element to take
        System.out.print("Char : "+chr);
    }
}