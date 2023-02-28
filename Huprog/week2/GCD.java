public class GCD {

    // brute force ebob bulma yontemi:
    public static int gcd(int a, int b){
        int counter = 0;
        for(int i = Math.min(a, b); i >= 1; i--){
            counter++;
            if(a % i == 0 && b % i == 0){
                System.out.println("Iterated in brute force gcd function " + counter + " times");
                return i;
            }
        }

        return 1;
    }

    // Euclid ebob bulma yontemi der ki:
    // gcd(a, b) = gcd(b, a%b)
    // base case: gcd(a, 0) = a

    public static int iterativeEuclidGcd(int a, int b){
        if(b == 0) return a;

        int temp, counter = 0;
        while (b != 0){
            temp = a;
            a = b;
            b = temp % b;
            counter++;
        }
        System.out.println("Iterated in euclid gcd function " + counter + " times");
        return a;
    }


    public static int recursiveEuclidGcd(int a, int b){
        if(b == 0) return a;
        return recursiveEuclidGcd(b, a%b);
    }


    public static void main(String[] args) {

        // EKOK(a, b) = a * b / EBOB(a, b)

        System.out.println("gcd(100000009, 100000007): " + gcd(100000009, 100000007) + "\n");

        System.out.println("iterativeEuclidGcd(100000009, 100000007): " + iterativeEuclidGcd(100000009, 100000007) + "\n");

        System.out.println("recursiveEuclidGcd(100000009, 100000007): " + recursiveEuclidGcd(100000009, 100000007) + "\n");


        System.out.println(iterativeEuclidGcd(91, 26));
    }
}
