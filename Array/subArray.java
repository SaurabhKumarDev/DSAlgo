// Print Sub-Array
public class subArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int count = 0;

        for (int i=0; i<arr.length; i++) {
            int start = i;

            for (int j=i; j<arr.length; j++) {
                int end = j;
                int temp = 0;

                for (int k=start; k<=end; k++) {
                    System.out.print(arr[k]+" ");
                    temp += arr[k];
                }
                System.out.println("\nSum : "+temp);
                System.out.println();

                count++;
            }
            System.out.println();
        }
        System.out.print("\n"+count);
    }
}