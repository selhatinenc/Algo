public class DynamicCombination {

    public static final int MOD = 1000000007;

    static int[][] matrix = new int[1001][1001];

    public static int combination(int n, int r){
        if(matrix[n][r] != 0) return matrix[n][r];
        if(r == 0 || n == r) return 1;

        matrix[n][r] = (combination(n-1, r-1) % MOD + combination(n-1, r) % MOD) % MOD;
        return matrix[n][r];
    }

    public static void main(String[] args) {

        long start;
        long end;


        // Time complexity: O(n^2) cunku matrisdeki cogu deger daha once hesaplanmamis olabilir
        // Ancak zaten hesapalanmis bir degeri bulmak istiyorsak O(1) surede cevap return edilecektir.
        start = System.nanoTime();
        System.out.println(combination(500, 250));
        end = System.nanoTime();

        System.out.println("Elapsed time: " + (end - start));


        start = System.nanoTime();
        System.out.println(combination(499, 99));
        end = System.nanoTime();

        System.out.println("Elapsed time: " + (end - start));
        
    }

}
