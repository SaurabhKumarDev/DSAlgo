public class Precedence {
    public static void main(String[] args) {
        /* Operators Precedence */
        int a = ~8;
        System.out.println(a);

        char ch ='D';
        int result = (Character.isLowerCase(ch)) ? 1 : (Character.isUpperCase(ch)) ? 0: -1;
        System.out.println(result);
    }
}
