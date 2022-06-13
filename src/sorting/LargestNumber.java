package sorting;

/**
 * Leetcode #179
 * https://leetcode.com/problems/largest-number/
 */

public class LargestNumber {

    public static void join(String[] nums, int start, int mid, int end) {
        String[] nums1 = new String[mid - start + 1];
        String[] nums2 = new String[end - mid];

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nums[start + i];
        }

        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = nums[mid + 1 + i];
        }

        int k = start, i = 0, j = 0;
        while (i != nums1.length && j != nums2.length) {
            if ((nums2[j] + nums1[i]).compareTo(nums1[i] + nums2[j]) > 0) {
                nums[k++] = nums2[j++];
            } else {
                nums[k++] = nums1[i++];
            }
        }

        while (i != nums1.length) {
            nums[k++] = nums1[i++];
        }

        while (j != nums2.length) {
            nums[k++] = nums2[j++];
        }
    }
    public static void getLargestNumber(String[] nums, int i, int j) {
        if (i < j) {
            int mid = (i + j) / 2;
            getLargestNumber(nums, i, mid);
            getLargestNumber(nums, mid + 1, j);
            join(nums, i, mid, j);
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        String[] strNums = new String[nums.length];
        for (int i = 0; i < strNums.length; i++) {
            strNums[i] = Integer.toString(nums[i]);
        }

        getLargestNumber(strNums, 0, strNums.length - 1);

        String current = "";
        for (String str: strNums) {
            current = current + str;
        }

        System.out.println(current);
    }
}
