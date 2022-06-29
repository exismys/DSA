package greedy;

public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(getMaxProfit(prices));
    }

    private static int getMaxProfit(int[] prices) {
        int maxProfit = 0;
        int buyValue = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyValue) {
                buyValue = prices[i];
            }
            int soldToday = prices[i] - buyValue;
            if (soldToday > maxProfit) {
                maxProfit = soldToday;
            }
        }
        return maxProfit;
    }
}
