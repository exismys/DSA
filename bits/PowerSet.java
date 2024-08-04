package bits;

public class PowerSet {
    // TC: O(2^n) where n is length of string
    public static String[] getPowerSet(String string) {
        int length = string.length();
        int numSubset = (int) Math.pow(2, length);
        String[] powerSet = new String[numSubset];

        for (int i = 0; i < numSubset; i++) {
            powerSet[i] = "";
            for (int j = 0; j < length; j++) {
                if ((i & (1 << j)) != 0) {
                    powerSet[i] = powerSet[i] + string.charAt(j);
                }
            }
        }
        return powerSet;
    }

    public static void main(String[] args) {
        for (String str: getPowerSet("abc")) {
            System.out.println(str);
        }
    }
}
