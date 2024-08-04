package greedy;

public class BuySellStock2 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(getMaxProfit(prices));
        System.out.println(getMaxProfit2(prices));
    }

    private static int getMaxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                profit += prices[i - 1] - buyPrice;
                buyPrice = prices[i];
            }
        }
        profit += prices[prices.length - 1] - buyPrice;
        return profit;
    }

    // Another method
    private static int getMaxProfit2(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit += Math.max(prices[i] - prices[i - 1], 0);
        }
        return profit;
    }
}
