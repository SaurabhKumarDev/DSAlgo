// Approch : When stock price goes low buy and sell after buying with the profit otherwise return 0

public class stockBuyAndSell {
    public static void main(String[] args) {
        int[] stockPrice = {4,1,3,6,5};

        int buyStock = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i<stockPrice.length; i++) {
            if (buyStock > stockPrice[i]) {
                buyStock = stockPrice[i];
            } else {
                int profit = stockPrice[i] - buyStock;
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        System.out.print(maxProfit);
    }
}