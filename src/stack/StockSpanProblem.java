package stack;

import java.util.ArrayDeque;

public class StockSpanProblem {
    public static int[] getStockSpan(int[] arr) {
        int[] ss = new int[arr.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                ss[i] = i - stack.peek();
            } else {
                ss[i] = i + 1;
            }
            stack.push(i);
        }

        return ss;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 2, 9, 5, 11, 5, 8, 10};
        int[] ss = getStockSpan(arr);

        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
    }
}
