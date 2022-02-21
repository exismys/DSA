package recursion_and_backtracking;

public class Fibonacci {
    // 0th: 0 1st: 1, TC: O(2^n)
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
