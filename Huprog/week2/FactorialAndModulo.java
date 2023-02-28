public class FactorialAndModulo {

    public static final int MOD = 1000000007;

    public static int factorial(int n, int mod) {
        if (n < 2) {
            return 1;
        }

        // n'i long'a castledik cunku factorial(n-1, mod) degeri 2^31-1'e yakin
        // bir deger olursa n ile carptigimizda overflow olma riski var.
        return (int) ((long) n * factorial(n - 1, mod) % mod);

    }

    public static long factorialIterative(int n, int mod) {
        long result = 1;
        while (n > 1) {
            result = (result * n--) % mod;
        }

        return result;
    }

    public static int mod(String number, int mod) {
        char[] digits = number.toCharArray();
        long result = 0; // int yapsaydik sikinti cikazdi ancak bazi uc durumlar
        // overflowa sebep olabilir
        int temp;

        int multiplicationCoefficient = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            temp = digits[i] - '0';
            result = (result + multiplicationCoefficient * temp) % mod;
            multiplicationCoefficient = (multiplicationCoefficient * 10) % mod;
        }
        /*
         * 452 mod 7 islemini yaptigimizi dusunelim:
         * 452 = 4 * 10^2 + 5 * 10^1 + 2 * 10^0
         * 
         * 452 mod 7 =
         * ((2 * 10^0) mod 7
         * + (5 * 10^1) mod 7
         * + (4 * 10^2) mod 7 ) mod 7
         * 
         * =
         * (2 * (10^0 mod 7)
         * + 5 * (10^1 mod 7)
         * + 4 * (10^2 mod 7)) mod 7
         * 
         * =
         * (2 * (10^0 mod 7)
         * + 5 * ((10^0 mod 7) * 10) mod 7
         * + 4 * ((10^1 mod 7) * 10) mod 7) mod 7
         * 
         * =
         * (2 * (1)
         * + 5 * (1 * 10) mod 7
         * + 4 * (3 * 10) mod 7) mod 7
         * 
         * = (2
         * + 5 * 3
         * + 4 * 2) mod 7
         * 
         * = 4
         * 
         * 
         */

        return (int) result;
    }

    public static void main(String[] args) {
        // System.out.println(factorialIterative(100000));

        System.out.println(mod(
                "1057942952037093750247584265824507683598" +
                        "1057942983270293756846884265824507683598" +
                        "1057942952037046848464824542648548454828" +
                        "1057942952037093750247584265874507683598" +
                        "1057942952037093750247584265824507683598" +
                        "60374592050932579204750294572049752945204720476204876247",
                MOD));
    }
}
