package bits;

public class PowerOfTwo {
    /**
     * Naive Method
     * TC: O(log(n))
     */
    public static boolean isPow(int num) {
        if (num == 0) {
            return false;
        }
        while (num != 1) {
            if (num % 2 != 0) {
                return false;
            }
            num = num / 2;
        }
        return true;
    }

    /**
     * Efficient Method
     * TC: O(1)
     */
    public static boolean isPow2(int num) {
        if (num == 0) {
            return false;
        }
        return ((num & (num - 1)) == 0);
    }

    public static void main(String[] args) {
        System.out.println(isPow(2)); // true
        System.out.println(isPow(4)); // true
        System.out.println(isPow(15)); // false
        System.out.println(isPow(32)); // true

        System.out.println(isPow2(2)); // true
        System.out.println(isPow2(4)); // true
        System.out.println(isPow2(15)); // false
        System.out.println(isPow2(32)); // true
    }
}
