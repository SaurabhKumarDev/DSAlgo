/*
* I suggest you to use the .valueOf();
* Converting anything to String use DataTypeToBeConverted.toString(variable);
* This function will work on maximum changing to dataType
*/

import java.util.Scanner;

public class DataType_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* *****************    1   ****************** */

        // 1. String to Int and long
        // Here, We need Exception Handling. String have all character, number, special character(!@#$%^&*()) that's why we need EH.
        try {
            String str = sc.next();

            int num = Integer.parseInt(str);
            int value = Integer.valueOf(str);

            long num1 = Long.parseLong(str);
            long value1 = Long.valueOf(str);

        } catch (Exception e) {
            System.out.println(e);
        }

        // 2. String to Byte and Short
        // Here, also need Exception Handling.
        try {
            String str = sc.next();

            Byte num = Byte.parseByte(str);
            Byte value = Byte.valueOf(str);

            Short num1 = Short.parseShort(str);
            Short value1 = Short.valueOf(str);

        } catch (Exception e) {
            System.out.println(e);
        }

        // 3. String to Float and double
        try {
            String str = sc.next();

            float num = Float.parseFloat(str);
            double value = Double.parseDouble(str);

            System.out.println(num+" "+value);
        } catch (Exception e) {
            System.out.println(e);
        }

        // 4. String to Char
        // We have to function for this 1. .charAt(index), 2. .toCharArray()
        // Here, no need exception handling because we use directly index, and char can take all type of input
        String str = "Hello";
        char ch = str.charAt(0);
        System.out.println(ch);
        char[] chr = str.toCharArray();
        for (int i=0; i<chr.length; i++) {
            System.out.println(chr[i]);
        }

        // 5. String to Boolean
        Boolean bool = Boolean.parseBoolean(str);

        /* ******************   2   ******************** */

        // 1. Int to String
        // No need of Exception Handling
        int number = 123;
        // i.) String.valueOf()
        String str0 = String.valueOf(number);
        // ii.) Integer.toString()
        String str1 = Integer.toString(number);
        // iii.) String.format()
        String str3 = String.format("%s", str);

        // 2. Int to long
        // No need more code for this Simply initialize the value
        long l = number;
        // long.valueOf();
        long l2 = Long.valueOf(number);
        // (long)
        long l3 = (long) number;

        // 3. Int to byte
        // Simply use the TypeCasting
        byte b = Byte.valueOf((byte) number);
        byte b1 = (byte) number;

        // 4. Int to Double
        double d = Double.valueOf(number);
        double d1 = number;

        // 5. Int to char
        // Simply use Type Casting
        char ch1 = (char) number;

        /* *********************    3   *********************** */

        // Long to String
        String str4 = String.valueOf(l2);
        String str5 = Long.toString(l2);

        // Long to Char
        // Simply use the TypeCasting
        char ch2 = (char) l2;

        // Long to Byte
        byte b2 = (byte) l2;

        // Long to double
        double d5 = (double) l2;
        Double d6 = Double.valueOf(l2);

        /* ***********************  4   ************************** */

        // Char to String
        char character = '1';
        String str6 = String.valueOf(character);
        String str8 = Character.toString(character);
        String str7 = (String) str6;

        // Char to Int
        // ASCII Value get
        int a = character;
        // Convert into real Int
        int val = Integer.parseInt(String.valueOf(character));
        int value = Character.getNumericValue(character);
        System.out.println(val+" "+value);
    }
}
