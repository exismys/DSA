package recursion;

public class CountDecodeWays {

    public static int count(String string, int length) {
        if (length == 0) {
            return 1;
        }

        int count1 = 0, count2 = 0;

        if (length >= 1) {
            int currentNumber = Integer.parseInt(string.substring(length - 1, length));

            if (currentNumber >= 1 && currentNumber <= 9)
                count1 = count(string, length - 1);
        }

        if (length >= 2) {
            int currentNumber = Integer.parseInt(string.substring(length - 2, length));

            if (currentNumber >= 10 && currentNumber <= 26)
                count2 = count(string, length - 2);
        }

        return count1 + count2;
    }

    public static void main(String[] args) {
        System.out.println(count("11", 2));
        System.out.println(count("1010", 4));
        System.out.println(count("1111", 4));
        System.out.println(count("111111111111111111111111111111111111111", 39));
    }
}
