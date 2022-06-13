package sorting;

import java.util.Arrays;
import java.util.Comparator;

class DecreasingComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return (Integer) o2 - (Integer) o1;
    }
}

public class SortDecreasing {
    public static void main(String[] args) {
        /**
         * When sorting with comparators, array passed should be of objects
         */
        Integer[] array =  {1, 10, 12};
        Arrays.sort(array, new DecreasingComparator());
        for (int num: array) {
            System.out.print(num + " ");
        }

        System.out.println();
        int[] arr = {1, 13, 10, 2};
        Arrays.sort(arr);
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int num: arr) {
            System.out.print(num + " ");
        }
    }

}
