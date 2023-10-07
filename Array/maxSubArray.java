// Max Sub Array
// Applied Brute Force
// TC - O(N^3)

public class maxSubArray {
    public static void maxSub(int arr[]) {
        int maxSum = 0;
       for (int k=0; k<arr.length; k++) {
           int temp = arr[k];
           for (int i=k; i<arr.length; i++) {
               int tem = 0;
               for (int j=k; j<=i; j++) {
                   tem += arr[j];
               }
               if (tem >= temp) {
                   temp = tem;
               }
           }
           if (maxSum <= temp) {
               maxSum = temp;
           }
           System.out.println(temp);
       }
       System.out.println("Max Sum : "+maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        maxSub(arr);
    }
}