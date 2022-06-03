package searching;

public class FrequencyOfElement {
    public static int getLowestIndex(int[] arr, int element) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] > element) {
                h = mid - 1;
            } else if (arr[mid] < element) {
                l = mid + 1;
            } else {
                if (arr[mid - 1] < arr[mid]) {
                    return mid;
                } else {
                    h = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int getHighestIndex(int[] arr, int element) {
        int l = 0;
        int h = arr.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] < element) {
                l = mid + 1;
            } else if (arr[mid] > element) {
                h = mid - 1;
            } else {
                if (arr[mid + 1] > arr[mid]) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
    public static int getFrequency(int[] arr, int element) {
        int lIndex = getLowestIndex(arr, element);
        int hIndex = getHighestIndex(arr, element);
        return hIndex - lIndex + 1;
    }

    public static void main(String[] args) {
        int[] array = new int[] {
                1, 2, 3, 4, 4, 4, 5, 5, 6
        };

        System.out.println(getFrequency(array, 4));
    }
}
