package bits;

public class CountSetBits {
    /**
     * Naive Method
     * TC: O(no. of bits)
     */
    public static int count(int num) {
        int count = 0;
        while (num != 0) {
            count += (num & 1);
            num = num >>> 1;
        }
        return count;
    }

    /**
     * Brian and Kerningham Algorithm
     * TC: O(no. of set bits)
     */
    public static int count2(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num & (num - 1);
        }
        return count;
    }

    /**
     * Lookup Table Method
     * TC: O(1), requires preprocessing
     */
    public static int count3(int num) {
        return table[num & 0xff] +
                table[(num >>> 8) & 0xff] +
                table[(num >>> 16) & 0xff] +
                table[(num >>> 24) & 0xff];
    }

    private static int[] table = new int[256];

    public static void initialize() {
        table[0] = 0;
        for (int i = 0; i < 256; i++) {
            table[i] = (i & 1) + table[i / 2];
        }
    }

    public static void main(String[] args) {
        System.out.println(count(8)); // 1
        System.out.println(count(7)); // 3
        System.out.println(count(5)); // 2
        System.out.println(count2(8)); // 1
        System.out.println(count2(5)); // 2
        System.out.println(count2(7)); // 3

        initialize();
        System.out.println(count3(8)); // 1
        System.out.println(count3(5)); // 2
        System.out.println(count3(7)); // 3
    }

}
