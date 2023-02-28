import java.util.Scanner;

import javax.xml.parsers.FactoryConfigurationError;

import java.util.*;;

class thepostman {
    static Scanner scanner;
    static int[] arr;

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        arr = new int[n];
        Arrays.fill(arr, 0);
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length; j += i + 1) {

                arr[j]++;
            }

        }
        int ans = 0;
        for (Integer i : arr) {
            if (i % 2 == 0)
                ans++;
        }
        System.out.println(ans);
    }
}