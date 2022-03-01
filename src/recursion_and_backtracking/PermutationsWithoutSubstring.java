package recursion_and_backtracking;

import java.util.ArrayList;

public class PermutationsWithoutSubstring {
    private static ArrayList<String> permutations;

    public static ArrayList<String> getPermutationsWithout(String string, String sub) {
        permutations = new ArrayList<>();
        generatePermutations(string, sub, "");
        return permutations;
    }

    private static void generatePermutations(String string, String sub, String perm) {
        if (ignoreBranch(string, perm, sub)) {
            return;
        }

        if (string.length() == 1) {
            permutations.add(perm + string.charAt(0));
            return;
        }

        for (int i = 0; i < string.length(); i++) {
            generatePermutations(string.substring(0, i) + string.substring(i + 1), sub, perm + string.charAt(i));
        }

    }

    private static boolean ignoreBranch(String string, String perm, String sub) {
        if (perm.contains(sub)) {
            return true;
        }
        if (string.length() == 1 && (perm + string).contains(sub)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(getPermutationsWithout("ABCD", "ABC").size());
    }
}
