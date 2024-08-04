package recursion;

import java.util.ArrayList;

// Leetcode #17 https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class PhoneLetterCombinations {
    private static ArrayList<String> letterCombinations;
    private static String[] digitMap;

    static {
        digitMap = new String[] {"abc", "def", "ghi", "jkl", "mno","pqrs", "tuv", "wxyz"};
    }

    public static ArrayList<String> getLetterCombinations(String digits) {
        letterCombinations = new ArrayList<>();
        generateCombinations(digits,"");
        return letterCombinations;
    }

    private static void generateCombinations(String digits,String combination) {
        if (digits.length() < 1) {
            letterCombinations.add(combination);
            return;
        }

        char currentChar = digits.charAt(0);
        String wordToProcess = digitMap[currentChar - '2'];

        if (digits.length() == 1) {
            for (int i = 0; i < wordToProcess.length(); i++) {
                String newComb = combination + wordToProcess.charAt(i);
                letterCombinations.add(newComb);
            }
            return;
        }

        for (int i = 0; i < wordToProcess.length(); i++) {
            generateCombinations(digits.substring(1), combination + wordToProcess.charAt(i));
        }
    }

    public static void main(String[] args) {
        for (String str: getLetterCombinations("234")) {
            System.out.print(str + ", ");
        }
    }
}
