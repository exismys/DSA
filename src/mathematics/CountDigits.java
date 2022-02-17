package mathematics;

public class CountDigits {
    /**
     * Continuous Division Method
     * TC: O(n) where n is number of digits in the input integer
     */
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    /**
     * Using mathematical formula: floor(log(num)) + 1
     * TC: O(1)
     */
    public static int countDigitsLog(int num) {
        return (int) Math.floor(Math.log10(num)) + 1;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(1234)); // 4
        System.out.println(countDigitsLog(1234)); // 4
    }
}
