package mathematics;

public class Factorial {
    public static long factorial(int num) {
        long factorial = 1;
        while (num != 1) {
            factorial *= num;
            num = num - 1;
        }
        return factorial;
    }

    // TC: O(log5(num))
    public static int countTrailingZeros(int num) {
        int count = 0;
        for (int i = 5; i <= num; i *= 5) {
            count += Math.floor(num / i);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(factorial(15));
        System.out.println(countTrailingZeros(15)); // 3
    }
}
