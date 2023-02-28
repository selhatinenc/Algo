import java.util.Scanner;

import java.util.*;;

public class trycatch_if_comparsion {

    public static void main(String[] args) {

        System.out.println(dothis() / doif());
        // dothis();

    }

    private static long dothis() {
        long start = System.nanoTime();

        int y = 0;
        int[] arr = new int[80000];
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 80000; j++) {
                try {
                    arr[y] = 1;
                    y++;
                } catch (Exception e) {
                    y = 0;
                }
            }
        }
        long end = System.nanoTime();
        long timeElapsed = end - start;
        System.out.println("Time elapsed:" + timeElapsed);
        return timeElapsed;

    }

    private static long doif() {
        long start = System.nanoTime();

        int y = 0;
        int[] arr = new int[80000];
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 80000; j++) {
                if (y < 80000) {

                    arr[y] = 1;
                    y++;
                } else {
                    y = 0;
                }
            }
        }
        long end = System.nanoTime();
        long timeElapsed = end - start;
        System.out.println("Time elapsed:" + timeElapsed);
        return timeElapsed;
    }

}