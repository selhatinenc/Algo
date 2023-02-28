import java.util.Scanner;

import javax.xml.parsers.FactoryConfigurationError;

import java.util.*;;

public class nonsensicalsum {
    static Scanner scanner;
    static int M = 1000000007;

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        scanner = new Scanner(System.in);
        System.out.println(dothis());

    }

    private static int dothis() {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (n % 2 == 1) {
            return sumfunc(n, k);

        } else {
            return sumfunc(k, k);

        }

    }

    private static int sumfunc(int n, int k) {
        long ans = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 1)
                ans+=powerStrings(String.valueOf(i), String.valueOf(i));
              //  ans += Math.pow(i, i);
            else {
                ans+=powerStrings(String.valueOf(i), String.valueOf(k));

               // ans += Math.pow(i, k);
            }
        }
        return (int) (ans % M);
    }
    static long MOD = (long) (1e9 + 7);

    // Returns modulo exponentiation for two numbers
    // represented as long long int. It is used by
    // powerStrings(). Its complexity is log(n)
    static long powerLL(long x, long n) {
        long result = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                result = result * x % MOD;
            }
            n = n / 2;
            x = x * x % MOD;
        }
        return result;
    }

    // Returns modulo exponentiation for
    // two numbers represented as strings.
    // It is used by powerStrings()
    static long powerStrings(String sa, String sb) {
        // We convert strings to number
        long a = 0, b = 0;

        // calculating a % MOD
        for (int i = 0; i < sa.length(); i++) {
            a = (a * 10 + (sa.charAt(i) - '0')) %
                    MOD;
        }

        // calculating b % (MOD - 1)
        for (int i = 0; i < sb.length(); i++) {
            b = (b * 10 + (sb.charAt(i) - '0')) %
                    (MOD - 1);
        }

        // Now a and b are long long int. We
        // calculate a^b using modulo exponentiation
        return powerLL(a, b);
    }
}
