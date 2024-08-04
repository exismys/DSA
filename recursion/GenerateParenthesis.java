package recursion;


import java.util.ArrayList;

public class GenerateParenthesis {
    private static ArrayList<String> pairs;

    private static void generate(int open, int close, String output) {
        if (open == 0 && close == 0) {
            pairs.add(output);
        }

        if (close < open) {
            return;
        }

        if (open > 0) {
            String newStr = output + "(";
            generate(open - 1, close, newStr);
        }

        if (close > 0) {
            String newStr = output + ")";
            generate(open, close - 1, newStr);
        }
    }

    public static ArrayList<String> generateParenthesis(int n) {
        pairs = new ArrayList<>();
        generate(n, n, "");
        return pairs;
    }

    public static void main(String[] args) {
        for (String str: generateParenthesis(3)) {
            System.out.print(str + " ");
        }
    }
}
