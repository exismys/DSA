package recursion;

public class JosephusProblem {
    public static int execute(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (execute(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        System.out.println(execute(5, 3));
    }
}
