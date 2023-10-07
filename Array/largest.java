import java.util.Arrays;

public class largest {
    public static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 5, -2, -6, -3, -9};
        System.out.print(largest(arr)+"\n");

        // Using inbuilt methods
        System.out.println(Arrays.stream(arr).max());
    }
}
