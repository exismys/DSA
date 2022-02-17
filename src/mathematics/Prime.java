package mathematics;

import java.util.ArrayList;

public class Prime {
    public static boolean isPrime(int num) {
        if (num == 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> primeFactors(int num) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        if (num <= 1) {
            return primeFactors;
        }
        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                primeFactors.add(i);
                num = num / i;
            }
        }
        if (num > 1) {
            primeFactors.add(num);
        }
        return primeFactors;
    }

    // More efficient way: similar to isPrime algorithm
    public static ArrayList<Integer> primeFactorsEff(int num) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        if (num <= 1) return primeFactors;
        while (num % 2 == 0) {
            primeFactors.add(2);
            num = num / 2;
        }
        while (num % 3 == 0) {
            primeFactors.add(3);
            num = num / 3;
        }
        for (int i = 5; i * i <= num; i += 6) {
            while (num % i == 0) {
                primeFactors.add(i);
                num = num / i;
            }
            while (num % (i + 2) == 0) {
                primeFactors.add(i + 2);
                num = num / (i + 2);
            }
        }
        if (num > 3) {
            primeFactors.add(num);
        }
        return primeFactors;
    }

    public static void main(String[] args) {
        System.out.println(primeFactorsEff(500)); // [2, 2, 5, 5, 5]
        System.out.println(isPrime(97)); // true
    }
}
