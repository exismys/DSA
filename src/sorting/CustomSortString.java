package sorting;

/**
 * Leetcode #791
 * https://leetcode.com/problems/custom-sort-string/submissions/
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CustomSortString {
    public static String sortString(String order, String str) {
        Character[] charArray = new Character[str.length()];
        char[] ca = str.toCharArray();
         for (int i = 0; i < ca.length; i++) {
             charArray[i] = ca[i];
        }


        Map<Character, Integer> ranks = new HashMap<>();
         for (int i = 0; i < order.length(); i++) {
             ranks.put(order.charAt(i), i);
         }

         Arrays.sort(charArray, new Comparator<Character>() {
             @Override
             public int compare(Character o1, Character o2) {
                 if (ranks.containsKey(o1) && ranks.containsKey(o2)) {
                     return ranks.get(o1) - ranks.get(o2);
                 } else if (ranks.containsKey(o1)) {
                     return -1;
                 } else if (ranks.containsKey(o2)) {
                     return 1;
                 } else {
                     return o1 - o2;
                 }
             }
         });

         String str1 = "";
         for (char c: charArray) {
             str1 = str1 + c;
         }
        return str1;
    }

    public static void main(String[] args) {
        System.out.println(sortString("cba", "abcd"));
    }
}
