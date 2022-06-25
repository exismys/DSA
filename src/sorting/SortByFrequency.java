package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortByFrequency {
    public static void main(String[] args) {
        Integer[] arr = {5, 5, 4, 6, 4};
        sortByFrequency(arr);
        for (int num: arr) {
            System.out.print(num + ", ");
        }
    }

    public static void sortByFrequency(Integer[] arr) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num: arr) {
            if (frequency.containsKey(num)) {
                frequency.put(num, frequency.get(num) + 1);
            } else {
                frequency.put(num, 1);
            }
        }

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (frequency.get(o1) > frequency.get(o2)) {
                    return -1;
                } else if (frequency.get(o1) < frequency.get(o2)) {
                    return 1;
                } else if (o1 < o2){
                    return -1;
                } else if (o1 > o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }
}
