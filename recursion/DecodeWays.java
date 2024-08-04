package recursion;

import java.util.ArrayList;

// Leetcode #91
public class DecodeWays {
    private static final char[] mapping;

    static {
        mapping = new char[27];
        for (int i = 1; i < 27; i++) {
            mapping[i] = (char) (64 + i);
        }
    }

    public static ArrayList<String> decodeNumber(String string) {
        ArrayList<String> possibleDecodes = new ArrayList<>();
        decode(string, possibleDecodes, "");
        return possibleDecodes;
    }

    private static void decode(String string, ArrayList<String> decodes, String decoded) {
        if (string.length() == 0) {
            decodes.add(decoded);
            return;
        }

        if (string.length() >= 1) {
            int number = Integer.parseInt(string.substring(0, 1));
            if (number > 0) {
                decode(string.substring(1), decodes, decoded + mapping[number]);
            } else {
                return;
            }
        }

        if (string.length() >= 2) {
            int number = Integer.parseInt(string.substring(0, 2));
            if (number > 9 && number < 27) {
                decode(string.substring(2), decodes, decoded + mapping[number]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(decodeNumber("1111"));
        System.out.println(decodeNumber("1011"));
//        System.out.println(decodeNumber("111111111111111111111111111111111111111")); // Time limit exceeded and out of memory error for large inputs
    }
}
