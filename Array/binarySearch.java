public class binarySearch {
    public static int binarySearch(int[] arr, int key) {
        int beg = 0;
        int end = arr.length;
        for (int i=0; i<=arr.length; i++) {
            int temp = end + beg;
            if (arr[temp/2] == key) {
                return (temp/2)+1;
            } else if (arr[temp/2] > key) {
                end = temp/2;
            } else if (arr[temp/2] < key) {
                beg = temp/2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9};

        System.out.print(binarySearch(arr, 4));
    }
}