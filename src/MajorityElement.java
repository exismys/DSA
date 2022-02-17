import java.util.HashMap;
import java.util.Map;

// LeetCode #169
public class MajorityElement {
    /**
     * Through HashMap
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int majorityElementHashMap(int[] array) {
        Map<Integer, Integer> elementCounts = new HashMap<Integer, Integer>();
        for (int num: array) {
            if (elementCounts.containsKey(num)) {
                elementCounts.put(num, elementCounts.get(num) + 1);
            } else {
                elementCounts.put(num, 1);
            }
        }

        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry: elementCounts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }
        return majorityEntry.getKey();
    }

    /**
     * Boyer-Moore Voting Algorithm
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int majorityElement(int[] array) {
        int count = 0;
        Integer candidate = null;
        for (int num: array) {
            if (count == 0) {
                candidate = num;
            }
            count += candidate == num ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 3, 4, 4, 1, 4};
        System.out.println(majorityElementHashMap(array)); // 4
        System.out.println(majorityElement(array)); // 4
    }
}
