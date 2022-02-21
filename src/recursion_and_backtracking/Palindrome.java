package recursion_and_backtracking;

public class Palindrome {
    public static boolean isPalindrome(String string, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return true;
        } else {
            return string.charAt(startIndex) == string.charAt(endIndex) && isPalindrome(string, startIndex + 1, endIndex - 1);
        }
    }

    public static void main(String[] args) {
        String name = "hannah";
        String greeting = "Hello";
        System.out.println(isPalindrome(name, 0, name.length() - 1)); // true
        System.out.println(isPalindrome(greeting, 0, greeting.length() - 1)); // false
    }
}
