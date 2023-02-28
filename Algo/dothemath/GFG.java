
// Java program to compute
// factorial of big numbers
class GFG {
    // Maximum number of digits in
    // output
    static final int MAX = 100000;

    // This function multiplies x
    // with the number represented by res[].
    // res_size is size of res[] or
    // number of digits in the number
    // represented by res[]. This function
    // uses simple school mathematics
    // for multiplication.
    // This function may value of res_size
    // and returns the new value of res_size
    static int multiply(int x, int res[], int res_size) {

        // Initialize carry
        int carry = 0;

        // One by one multiply n with
        // individual digits of res[]
        for (int i = 0; i < res_size; i++) {
            int prod = res[i] * x + carry;

            // Store last digit of
            // 'prod' in res[]
            res[i] = prod % 10;

            // Put rest in carry
            carry = prod / 10;
        }

        // Put carry in res and
        // increase result size
        while (carry > 0) {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }

    // This function finds
    // power of a number x
    static String power(int x, int n) {

        // printing value "1" for power = 0

        int res[] = new int[MAX];
        int res_size = 0;
        int temp = x;

        // Initialize result
        while (temp != 0) {
            res[res_size++] = temp % 10;
            temp = temp / 10;
        }

        // Multiply x n times
        // (x^n = x*x*x....n times)
        for (int i = 2; i <= n; i++)
            res_size = multiply(x, res, res_size);

        // System.out.print(x + "^" + n + " = ");
        String ans = "";
        for (int i = res_size - 1; i >= 0; i--)
            ans += res[i];
        return ans;
    }

    // Driver code
    public static void main(String[] args) {
        int exponent = 1;
        int base = 1;
      //  String res = power(base, exponent);

        System.out.println(powerStrings("1000000000000000000000000000000", "10000000000000000"));
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