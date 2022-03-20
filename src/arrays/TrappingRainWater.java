package arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 1, 8, 12};
        System.out.println(returnTrappedWater(array));
    }

    private static int returnTrappedWater(int[] array) {
        int length = array.length;
        int[] leftMax = new int[length];
        int[] rightMax = new int[length];
        leftMax[0] = array[0]; rightMax[length - 1] = array[length - 1];

        for (int i = 1; i < length; i++) {
            leftMax[i] = Math.max(array[i], leftMax[i - 1]);
        }

        for (int i = length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(array[i], rightMax[i + 1]);
        }

        int totalTrapped = 0;

        for (int i = 1; i < length - 1; i++) {
            totalTrapped += Math.min(leftMax[i], rightMax[i]) - array[i];
        }

        return totalTrapped;
    }
}
