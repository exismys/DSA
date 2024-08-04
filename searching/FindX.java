package searching;

import java.util.Scanner;

public class FindX {
    /**
     * @param c
     * @return x such that x * x + sqrt(x) == c
     */
    public static int findX(double c) {
        int l = 0;
        int h = (int) c;
        while (l <= h) {
            int mid = (l + h) / 2;
            double y = mid * mid + Math.sqrt(mid);
            if (Math.abs(y - c) <= Math.pow(10, -6)) {
                return mid;
            } else if (y < c) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        System.out.println(findX(c));
    }
}
