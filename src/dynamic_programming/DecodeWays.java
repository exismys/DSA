package dynamic_programming;


import java.util.HashMap;

// Leetcode #91
public class DecodeWays {
    private static HashMap<String, Integer> memo;

    public static int getCount(String string) {
        memo = new HashMap<>();
        return count(string, 0, string.length() - 1);
    }

    public static int count(String string, int start, int end) {
        int length = end - start + 1;

        if (length == 0) {
            return 1;
        }

        int count1 = 0, count2 = 0;

        if (length >= 1) {
            int currentNumber = Integer.parseInt(string.substring(end, end + 1));
            String remaining = string.substring(start, end);

            if (currentNumber >= 1 && currentNumber <= 9)
                if (memo.containsKey(remaining))
                    count1 = memo.get(remaining);
                else {
                    count1 = count(string, start, end - 1);
                    memo.put(remaining, count1);
                }

        }

        if (length >= 2) {
            int currentNumber = Integer.parseInt(string.substring(end - 1, end + 1));
            String remaining = string.substring(start, end - 1);

            if (currentNumber >= 10 && currentNumber <= 26)
                if (memo.containsKey(remaining))
                    count2 = memo.get(remaining);
                else {
                    count2 = count(string, start, end - 2);
                    memo.put(remaining, count2);
                }
        }

        return count1 + count2;
    }

    public static void main(String[] args) {
        System.out.println(getCount("1111"));
        System.out.println(getCount("1010"));
        System.out.println(getCount("111111111111111111111111111111111111111"));
    }
}
