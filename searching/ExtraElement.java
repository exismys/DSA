package searching;

public class ExtraElement {
    public static int getExtraElement(int[] arr1, int[] arr2) {
        int low = 0;
        int high = arr1.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr1[mid] == arr2[mid]) {
                low = mid + 1;
            } else {
                if (mid == 0) {
                    return mid;
                } else if (arr1[mid] == arr2[mid - 1]) {
                    high = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {2, 4, 5, 8, 10, 11, 12, 14};
        int[] arr2 = new int[] {2, 4, 5, 8, 11, 12, 14};

        System.out.println(getExtraElement(arr1, arr2));
    }
}
