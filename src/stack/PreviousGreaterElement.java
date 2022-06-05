package stack;

import java.util.ArrayDeque;

public class PreviousGreaterElement {
    public static int[] getPGE(int[] arr) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                arr2[i] = stack.peek();
            } else {
                arr2[i] = -1;
            }
            stack.push(i);
        }

        return arr2;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 2, 9, 5, 11, 5, 8, 10};
        int[] pg = getPGE(arr);

        for (int i = 0; i < pg.length; i++) {
            System.out.println(pg[i] + " ");
        }
    }
}
