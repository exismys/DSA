package mathematics;


import java.util.ArrayList;

public class Divisors {
    public static ArrayList<Integer> getDivisors(int num) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
                if (i != num / i) {
                    divisors.add(num / i);
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        System.out.println(getDivisors(500));
    }
}
