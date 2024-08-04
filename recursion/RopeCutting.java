package recursion;

public class RopeCutting {
    // TC: O(2 ^ n)
    public static int maxCut(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }

        if (n < 0) {
            return -1;
        }

        int maxCut = (int) Math.max(maxCut(n - a, a, b, c), Math.max(maxCut(n - b, a, b, c), maxCut(n - c, a, b, c)));

        if (maxCut < -1)
            return -1;

        return maxCut + 1;
    }

    public static void main(String[] args) {
        System.out.println(maxCut(5, 2, 1, 5));
    }
}
