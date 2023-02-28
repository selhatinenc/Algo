//interface Measurable {
//    void execute();
//}

public class FastExponent {

//    public static long measureTime(Measurable measurable){
//        long start, end;
//        start = System.currentTimeMillis();
//
//        measurable.execute();
//        end = System.currentTimeMillis();
//
//        return end - start;
//    }

    private static final int MOD = 1000000009;


    // Time complexity: O(N)
    public static int exponent(int base, int exponent, int mod){
        long result = 1;

        for (int i = 0; i < exponent; i++) {
            result = (result * base) % mod;
        }
        return (int)result;
    }

    // Time complexity: O(log N)
    // Cunku her dongude exponent degiskenini ikiye boluyoruz.
    public static int fastExponent(int base, int exponent, int mod){

        long result = 1;
        long multiplier = base;

       while (exponent >= 1){
           if(exponent % 2 == 1){
               result = (result * multiplier) % mod;
           }
           exponent /= 2;
           multiplier = (multiplier * multiplier) % mod;
       }
        return (int)result;
    }




    public static void main(String[] args) {
//        Measurable bruteForceExponent = () -> exponent(17877941, 457967412, MOD);
//        Measurable fastExponent = () -> fastExponent(17877941, 457967412, MOD);
//
//
//        System.out.println("Brute force exponent takes " + measureTime(bruteForceExponent) + " milliseconds");
//        System.out.println("Fast exponent takes " + measureTime(fastExponent) + " milliseconds");


        int base, power;
        base = 767867868;
        power = 45796741;
        long start, end;
        int result;

        start = System.nanoTime();
        result = exponent(base, power, MOD);
        end = System.nanoTime();

        System.out.println("Brute force exponent takes: " + (end - start) + " nano secods");
        System.out.println(base + "^" + power + " mod " + MOD + " = " + result);

        System.out.println("\n");

        start = System.nanoTime();
        result = fastExponent(base, power, MOD);
        end = System.nanoTime();

        System.out.println("Fast exponent takes: " + (end - start) + " nano secods");
        System.out.println(base + "^" + power + " mod " + MOD + " = " + result);


    }


}
