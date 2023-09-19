public class Overloading {
    /* Function Overloading */

    // Same returnType and functionName, Different parameter
    public static int sum(int a, int b) {
        return a+b;
    }
    public static int sum(int a, int b, int c) {
        return a+b;
    }

    // Different returnType and parameter, Same functionName
    public static float sum(float a, float b) {
        return a+b;
    }

    /*
    Different returnType, Same functionName and paramter
        public static long sum(int a, int b) {
            return a+b;
        }
    */

}