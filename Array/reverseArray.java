public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        for (int i=0; i<arr.length/2; i++) {
            int end = arr.length-i-1;

            // Swap
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
        }
        for (int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
    }
}
