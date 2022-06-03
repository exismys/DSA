package searching;

public class KthSmallestElement {
    public static int lesserOrEqualElementCount(int[] arr, int el) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= el) count++;
        }
        return count;
    }
    public static int getKthSmallest(int[] arr, int k, int rangeLower, int rangeHigher) {
        while (rangeLower <= rangeHigher) {
            int mid = (rangeHigher + rangeLower) / 2;
            int count = lesserOrEqualElementCount(arr, mid);
            if (count >= k) {
                if (lesserOrEqualElementCount(arr,mid - 1) >= k) {
                    rangeHigher = mid - 1;
                } else {
                    return mid;
                }
            } else {
                rangeLower = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 6, 4, 3, 1, 8, 6};

        System.out.println(getKthSmallest(arr, 3, 1, 8));
    }
}
