package array;

public class StockMaxProfit {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 1, 8, 12};
        System.out.println(returnMaxProfit(array));
    }

    private static int returnMaxProfit(int[] array) {
        int currentProfit = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                currentProfit += array[i + 1] - array[i];
            }
        }
        return currentProfit;
    }
}
