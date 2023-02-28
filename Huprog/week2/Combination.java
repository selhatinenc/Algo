public class Combination {

    public static long combination(int n, int r){
        long result = 1;
        for (int i = n; i > n - r; i--) {
            result = result * i / (n-i+1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(combination(5, 3));
        System.out.println(combination(5, 2));
        System.out.println(combination(5, 1));
        System.out.println(combination(5, 0));
        System.out.println(combination(10, 4));
    }
}
