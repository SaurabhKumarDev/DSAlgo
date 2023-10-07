public class singleSubArray {
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        int prefix[] = new int[arr.length];

        // Calculation within array
        for (int i=0; i<arr.length; i++)
            prefix[i] = (i != 0) ? (arr[i] + prefix[i - 1]) : arr[i];

        // Print the calculated value/prefix array
        for (int i=0; i<prefix.length; i++)
            System.out.println(prefix[i]);
    }
}