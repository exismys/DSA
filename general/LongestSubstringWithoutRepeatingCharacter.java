package general;

public class LongestSubstringWithoutRepeatingCharacter {
    public static int getLength(String str) {
        int maxLength = 1;
        int currentLength = 0;

        int[] frequency = new int[256];

        int i = 0, j = 0;

        while (j < str.length()) {
            char cc = str.charAt(j);
            if (frequency[cc] == 0) {
                currentLength++;
                frequency[cc]++;
                j++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                while (i < j && frequency[cc] != 0) {
                    frequency[str.charAt(i)]--;
                    currentLength--;
                    i++;
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(getLength("abcabcbb"));
    }
}
