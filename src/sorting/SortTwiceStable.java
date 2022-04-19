package sorting;

// First sorting by name and then numerical value of associated roman string; sort is stable

import general.RomanToNums;

import java.util.Arrays;
import java.util.Comparator;

class NameComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] strArr1 = o1.split(" ");
        String[] strArr2 = o2.split(" ");
        return strArr1[0].compareTo(strArr2[0]);
    }
}

class NumberComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] strArr1 = o1.split(" ");
        String[] strArr2 = o2.split(" ");
        int num1 = RomanToNums.num(strArr1[1]);
        int num2 = RomanToNums.num(strArr2[1]);
        if (strArr1[0].equals(strArr2[0])) {

            if (num1 == num2) {
                return 0;
            } else if (num1 > num2) {
                return 1;
            } else {
                return -1;
            }

        } else {
            return 0;
        }
    }
}

public class SortTwiceStable {
    public static void main(String[] args) {
        String[] strArr = {"John X", "Ayesha VII", "Arnold V", "Exismys LX", "Bob XXVIII", "Ritesh XIV", "Joseph C", "Marigold III", "Ayesha V", "Marigold I", "John V", "Exismys LXI"};

        sortByName(strArr);
        for (String str: strArr) {
            System.out.println(str);
        }

        System.out.println();

        sortByNumber(strArr);
        for (String str: strArr) {
            System.out.println(str);
        }
    }

    public static void sortByName(String[] arr) {
        Arrays.sort(arr, new NameComparator());
    }

    public static void sortByNumber(String[] arr) {
        Arrays.sort(arr, new NumberComparator());
    }
}
