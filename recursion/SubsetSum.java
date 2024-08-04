package recursion;

public class SubsetSum {
    public static int countSubsetsWithSum(int[] array, int sum, int current) {
        if (current == array.length) {
            return sum == 0 ? 1 : 0;
        }

        return countSubsetsWithSum(array, sum - array[current], current + 1) +
                countSubsetsWithSum(array, sum, current + 1);
    }

    public static void main(String[] args) {
        System.out.println(countSubsetsWithSum(new int[] {2, 5, 5, 2, 6}, 10, 0                                                                                         ));
    }
}
