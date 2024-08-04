package stack;

import java.util.ArrayDeque;

public class LargestAreaInHistogram {
    public static int getLargestArea(int[] arr) {
        int res = Integer.MIN_VALUE;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                int cr = stack.peek();
                stack.pop();
                if (!stack.isEmpty()) {
                    int ps = stack.peek();
                    int ns = i;
                    res = Math.max(res, (ns - ps - 1) * arr[cr]);
                } else {
                    res = Math.max(res, i * arr[cr]);
                }
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int curr = stack.peek();
            stack.pop();
            if (stack.isEmpty()) {
                res = Math.max(res, arr.length * arr[curr]);
            } else {
                res = Math.max(res, (arr.length - 1 - stack.peek()) * arr[curr]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 2, 9, 5, 11, 5, 8, 10};
        System.out.println(getLargestArea(arr));
    }
}
