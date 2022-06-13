package backtracking;

import java.util.ArrayDeque;
import java.util.Scanner;

public class GenerateBrackets {
    public static ArrayDeque<Character> stack;
    public static void generateBrackets(int so, int sc, int mo, int mc, String output, ArrayDeque<Character> stack) {
        stack = new ArrayDeque<>(stack);
        if (so == 0 && sc == 0 && mo == 0 && mc == 0) {
            System.out.println(output);
            return;
        }

        if (sc < so || mc < mo) {
            return;
        }


        if (so > 0) {
            stack.push('(');
            generateBrackets(so - 1, sc, mo, mc, output + "(", stack);
            stack.pop();
        }


        if (sc > 0) {
            if (!stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
                generateBrackets(so, sc - 1, mo, mc, output + ")", stack);
                stack.push('(');
            }
        }

        if (mo > 0) {
            stack.push('{');
            generateBrackets(so, sc, mo - 1, mc, output + "{", stack);
            stack.pop();
        }


        if (mc > 0) {
            if (!stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
                generateBrackets(so, sc, mo, mc - 1, output + "}", stack);
                stack.push('{');
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        stack = new ArrayDeque<>();
        generateBrackets(m, m, n, n, "", stack);
    }
}
