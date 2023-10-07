// 03) Kadane-s algorithm
// Best aproch
// +ve + +ve = +ve      Y
// +ve + -ve = +ve      Y
// +ve + ---ve = -ve    X
// Time Complexity = O(N)

public class kadaneMaxSubArray {
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        int currentSum = 0, maxSum = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++) {
            currentSum += arr[i];
            if (currentSum < 0) currentSum = 0;
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.print(maxSum);
    }
}