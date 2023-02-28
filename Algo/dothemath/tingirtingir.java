//Brace your keyboard
//inzva community built algoleague for every algorithm enthusiast hungry for self-improvement and friendly competition. Have fun and good luck!

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static Scanner scanner;
    static int time;
    static int money;

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        scanner = new Scanner(System.in);
        dothis();
    }

    private static void dothis() {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = (int) scanner.nextLong();
        int[] standart = new int[m];
        int[] other;
        time = 2;
        int index = 0;
        while (index < m) {
            standart[index] = scanner.nextInt();
            index++;
        }
        index = 0;
        boolean contmore = true;
        boolean contless = true;
        // int minhund;
        // int sechund;
        while (index < n) {
            contmore = true;
            contless = true;
            index++;
            other = new int[m];
            int a = 0;
            // minhund = 0;
            while (a < m) {
                other[a] = scanner.nextInt();

                if (contless == true || contmore == true) {

                    int absof = Math.abs(other[a] - standart[a]);
                    // System.out.println(absof);
                    if (absof < 100) {
                        contless = false;
                        contmore = false;
                    } else if (other[a] < standart[a]) {
                        contmore = false;
                    } else if (other[a] > standart[a]) {
                        contless = false;
                    }

                }

                a++;
            }
            // System.out.println(contmore);
            if (contmore == true)
                P2(standart, other);
            // Pnewm(standart, other);
            else if (contless == true)
                P2(standart, other);
            // Nnewm(standart, other);
            else {
                doeswork(standart, other);
            }
        }
        System.out.println(money);

    }

    private static boolean doeswork(int[] standart, int[] other) {
        // int i=0;
        int dist, div, mod;
        int needtime = 0;
        for (int j = 0; j < other.length; j++) {
            dist = Math.abs(standart[j] - other[j]);
            // System.out.println(dist);

            mod = dist % 50;
            div = dist / 50;
            if (mod > 20)
                needtime++;
            needtime += div;

        }
        // System.out.println(needtime);

        if (needtime <= time) {
            time += 2;
            money += 500;
            // System.out.println(money);

            return true;
        }
        // System.out.println(money);
        return false;
    }

    private static int newdoes(int[] standart, int[] other) {
        // int i=0;
        int dist, div, mod;
        int needtime = 0;
        for (int j = 0; j < other.length; j++) {
            dist = Math.abs(standart[j] - other[j]);
            // System.out.println(dist);

            mod = dist % 50;
            div = dist / 50;
            if (mod > 20)
                needtime++;
            needtime += div;

        }
        // System.out.println(needtime);

        return needtime;
    }

    private static void P2(int[] standart, int[] other) {
        int[] copy = other.clone();

        // int min = -1;
        int sum = 0;
        for (int i = 0; i < other.length; i++)
            sum += other[i];

        int sum2 = 0;
        for (int i = 0; i < standart.length; i++)
            sum2 += standart[i];

        int div = (sum - sum2) / 4;
        if (div > 0) {

            div -= div % 100;
        } else {

            div += 100 - ((-div) % 100);
        }
        for (int i = 0; i < other.length; i++) {
            other[i] += div;
        }
        int needtime = newdoes(standart, other);
        int temptime;

        while (true) {
            for (int i = 0; i < other.length; i++) {
                other[i] += 100;
            }
            temptime = newdoes(standart, other);
            if (needtime < temptime)
                break;
            else
                needtime = temptime;
        }

        while (true) {
            for (int i = 0; i < other.length; i++) {
                copy[i] -= 100;
            }
            temptime = newdoes(standart, copy);
            if (needtime < temptime)
                break;
            else
                needtime = temptime;
        }
        if (needtime <= time) {
            time += 2;
            money += 500;
            // System.out.println(money);

        }
    }

    private static void Pnewm(int[] standart, int[] other) {
        int[] copy = standart.clone();

        int min = -1;

        for (int i = 0; i < other.length; i++) {

            if (other[i] - standart[i] < min || min == -1)
                min = (other[i] - standart[i]);
        }
        min -= min % 100;
        if (min != -1)
            for (int i = 0; i < other.length; i++) {
                other[i] -= min;
            }
        doeswork(standart, other);

    }

    private static void Nnewm(int[] standart, int[] other) {
        int min = -1;

        for (int i = 0; i < other.length; i++) {

            if (standart[i] - other[i] < min || min == -1)
                min = (standart[i] - other[i]);//
        }
        min -= min % 100;

        if (min != -1)
            for (int i = 0; i < other.length; i++) {
                other[i] += min;
            }
        doeswork(standart, other);

    }

}
