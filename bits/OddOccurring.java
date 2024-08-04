package bits;

public class OddOccurring {
    public static int getOneOddOccurring(int[] elements) {
        int xor = 0;
        for (int i = 0; i < elements.length; i++) {
            xor = xor ^ elements[i];
        }
        return xor;
    }

    public static int[] getTwoOddOccurring(int[] elements) {
        int xor = 0;
        int[] res = new int[2];
        for (int i = 0; i < elements.length; i++) {
            xor = xor ^ elements[i];
        }

        // Finds the rightmost set bit
        int sb = (xor & -xor);

        for (int i: elements) {
            if ((i & sb) != 0) {
                res[0] = res[0] ^ i;
            } else {
                res[1] = res[1] ^ i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] oneOdd = {1, 1, 2, 3, 2, 3, 4, 4, 2};
        int[] twoOdd = {1, 1, 2, 3, 2, 3, 4, 4, 2, 7, 7, 1};
        System.out.println(getOneOddOccurring(oneOdd)); // 2
        for (int i: getTwoOddOccurring(twoOdd)) {
            System.out.print(i + " ");
        } // 1 2
    }
}
