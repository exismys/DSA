package mathematics;

public class GCD {
    // Euclidean algorithm: iterative
    public static int gcdIterative(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    // Euclidean algorithm: optimized
    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursive(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcdRecursive(a, b);
    }

    public static void main(String[] args) {
        System.out.println(gcdIterative(10, 5)); // 5
        System.out.println(gcdRecursive(24, 16)); // 8
        System.out.println(lcm(16, 24)); // 48
    }
}
