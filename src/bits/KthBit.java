package bits;

public class KthBit {
    // Method 1: Left shift
    public static boolean isSetLeft(int num, int k) {
        if ((num & (1 << (k - 1))) != 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method 2: Right shift
    public static boolean isSetRight(int num, int k) {
        if ((num & (num >> (k - 1))) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isSetLeft(5, 3));  // true
        System.out.println(isSetRight(5, 3)); // true
        System.out.println(isSetRight(5, 2)); // false
        System.out.println(isSetLeft(5, 2)); // false
    }
}
