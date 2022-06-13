package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> getTriplets(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {
            if (i == 0 || i != 0 && arr[i] != arr[i - 1]) {
                int target = -arr[i];
                int p1 = i + 1;
                int p2 = arr.length - 1;
                while (p1 < p2) {
                    int current = arr[p1] + arr[p2];
                    if (current > target) {
                        p2--;
                    } else if (current < target) {
                        p1++;
                    } else {
                        triplets.add(Arrays.asList(arr[i], arr[p1], arr[p2]));
                        if (arr[p1] == arr[p2]) break;
                        while (p1 < p2 && arr[p1] == arr[p1 + 1]) {
                            p1++;
                        }
                        while (p1 < p2 && arr[p2] == arr[p2 - 1]) {
                            p2--;
                        }
                        p1++; p2--;
                    }
                }
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};

        System.out.println(getTriplets(arr));
    }
}
