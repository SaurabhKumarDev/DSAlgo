public class inFunction {
    public static void update(int[] arr) {
        for (int i=0; i<arr.length; i++) { arr[i] += 1; System.out.println(arr[i]); }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,2,7};

        // Call by reference
        update(arr);

        // Value is updated here for array
    }
}
