package mathematics;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static boolean[] sieve(int n) {
        boolean[] primes = new boolean[n + 1]; // Array is filled with false value
        Arrays.fill(primes, true);

        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }
        return primes;
    }

    public static void printPrimes(boolean[] primes) {
        for (int i = 2; i <= primes.length - 1; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        printPrimes(sieve(25)); // 2 3 5 7 11 13 17 19 23
    }
}
