package mathematics;

public class PalindromeNumbers {
    // TC: O(no. of digits)
    public static boolean isPalindrome(int num) {
        int numInverted = 0;
        int numOriginal = num;
        while (num != 0) {
            numInverted = numInverted * 10 + (num % 10);
            num = num / 10;
        }

        if (numOriginal == numInverted) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221)); // true
        System.out.println(isPalindrome(10000)); // false
    }
}
