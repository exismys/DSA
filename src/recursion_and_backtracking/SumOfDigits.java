package recursion_and_backtracking;

public class SumOfDigits {
    public static int sum(int num) {
        if (num < 10) {
            return num;
        }
        return sum(num / 10) + num % 10;
    }

    public static void main(String[] args) {
        System.out.println(sum(1234)); // 10
    }
}
