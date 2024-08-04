package mathematics;

public class Power {
    // TC: O(n) SC: O(1)
    public static int powerLinear(int x, int n) {
        int result = 1;
        while (n-- != 0) {
            result *= x;
        }
        return result;
    }

    // TC: O(log(n)) SC: O(log(n))
    public static int powerRecursive(int x, int n) {
        if (n == 0) return 1;
        if (n % 2 == 0) {
            int temp = powerRecursive(x, n / 2);
            return temp * temp;
        } else {
            return powerRecursive(x, n - 1) * x;
        }
    }

    /**
     * Computing power using binary logic
     * TC: O(log(n))
     * SC: O(1)
     */
    public static int powerBinary(int x, int n) {
        int place = x;
        int result = 1;

        while (n != 0) {
            if (n % 2 != 0) {
                result *= place;
            }
            place = place * place;
            n = n / 2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(powerLinear(2, 5)); // 32
        System.out.println(powerRecursive(2, 5)); // 32
        System.out.println(powerBinary(2, 5)); // 32
    }
}
