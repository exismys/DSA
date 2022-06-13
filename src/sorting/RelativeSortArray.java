package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class RelativeSortArray {

    public static Integer[] relativeSort(Integer[] arr1, Integer[] arr2) {
        Map<Integer, Integer> ranks = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            ranks.put(arr2[i], i);
        }

        Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer i1 = o1;
                Integer i2 = o2;
                if (ranks.containsKey(i1) && ranks.containsKey(i2)) {
                    return ranks.get(i1) - ranks.get(i2);
                } else if (ranks.containsKey(i1)) {
                    return -1;
                } else if (ranks.containsKey(i2)) {
                    return 1;
                } else {
                    return i1 - i2;
                }
            }
        });

        return arr1;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        Integer[] arr2 = {2,1,4,3,9,6};
        Integer[] arr = relativeSort(arr1, arr2);
        for (int num: arr) {
            System.out.print(num + " ");
        }
    }
}
