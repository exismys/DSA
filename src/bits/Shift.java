package bits;

public class Shift {
    public static void main(String[] args) {
        // Left shift with negative number
        System.out.println(-1 << 1); // -2

        // Left shift with +ve number
        int x = 4;
        System.out.println(x << 1); // 8
        System.out.println(x << 2); // 16

        // Right shift with +ve number
        System.out.println(x >> 1); // 2 (rightmost digit would be replaced by 0)

        // Right shift with -ve number
        System.out.println(-1 >> 1); // -1 (rightmost digit would be replaced by 1)

        // Unsigned right shift
        System.out.println(-1 >>> 1); // 2147483647 (rightmost digit would be replaced by 0)
    }
}
