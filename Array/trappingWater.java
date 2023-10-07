public class trappingWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};

        int currentLeft = 0, currentRight = 0, totalTrap = 0;

        int[] temp = new int[arr.length];
        for (int j=0; j<arr.length; j++) {
            int maxRight = Math.max(currentRight, arr[arr.length-j-1]);
            currentRight = maxRight;
            temp[arr.length-j-1] = maxRight;
        }

        for (int i=0; i<arr.length; i++) {
            int maxLeft = Math.max(currentLeft,arr[i]);
            currentLeft = maxLeft;

            int maxRight = temp[i];

            int minOf2Method = Math.min(maxRight, maxLeft);
            int currentTrap = minOf2Method - arr[i];
            totalTrap += currentTrap;
        }
        System.out.print(totalTrap);
    }
}