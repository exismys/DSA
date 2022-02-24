package recursion_and_backtracking;

import java.util.ArrayList;

public class Permutations {
    private static ArrayList<String> permutations;

    public static ArrayList<String> getAllPermutations(String string) {
        permutations = new ArrayList<>();
        generatePermutations(string,"");
        return permutations;
    }

    private static void generatePermutations(String string, String  perm) {
        if (string.length() == 1) {
            permutations.add(perm + string.charAt(0));
            return;
        }

        for (int i = 0; i < string.length(); i++) {
            generatePermutations(string.substring(0, i) + string.substring(i + 1),perm + string.charAt(i));
        }

    }

    public static void main(String[] args) {
        System.out.println(getAllPermutations("ABCD").size());
    }
}
