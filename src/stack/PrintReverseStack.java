package stack;

import java.util.ArrayDeque;

public class PrintReverseStack {
    public static void printReverse(ArrayDeque<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.peek();
            stack.pop();
            printReverse(stack);
            System.out.println(temp);
        }
    }
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        printReverse(stack);
    }
}
