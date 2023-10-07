// 02) Find the Max Sub Array
// Time complexity = O(N^2)

public class prefixMaxSubArray {
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        int maxValue = Integer.MIN_VALUE;

        // Calculation within array
        for (int j=0; j<arr.length; j++) {
            int prefix[] = new int[arr.length];

            for (int i=j; i<arr.length; i++) {
                if (i != 0) {
                    prefix[i] = arr[i] + prefix[i - 1];
                    if (maxValue < prefix[i]) maxValue = prefix[i];
                } else {
                    maxValue = arr[i];
                    prefix[i] = arr[i];
                }
            }
        }
        System.out.println("Max : "+maxValue);
    }
}