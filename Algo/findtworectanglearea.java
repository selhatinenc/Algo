import java.util.Scanner;
import java.util.*;;

class findtworectanglearea {
    public static void main(String[] args) {
        System.out.println(computeArea(1, 2, 3, 4, 3, 3, 3, 2));
    }

    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        return 0;
    }
}

// Bu kod bir ilk (this codes works in first try )
class Solution {

    int[] X1arr;
    int[] X2arr;
    int[] Y1arr;
    int[] Y2arr;

    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        X1arr = new int[2];
        X2arr = new int[2];
        Y1arr = new int[2];
        Y2arr = new int[2];
        fullarr(ax1, ax2, X1arr);
        System.out.println(X1arr[0] + " " + X1arr[1]);
        fullarr(bx1, bx2, X2arr);
        System.out.println(X2arr[0] + " " + X2arr[1]);
        fullarr(ay1, ay2, Y1arr);
        System.out.println(Y1arr[0] + " " + Y1arr[1]);
        fullarr(by1, by2, Y2arr);
        System.out.println(Y2arr[0] + " " + Y2arr[1]);

        int tempx1, tempx2, heig1, heigh2;
        if (X1arr[0] >= X2arr[0]) {
            tempx1 = X1arr[0];
        } else {
            tempx1 = X2arr[0];
        }
        if (X1arr[1] <= X2arr[1]) {
            if (X1arr[1] < tempx1)
                tempx2 = tempx1;
            else
                tempx2 = X1arr[1];
        } else {
            if (X2arr[1] < tempx1)
                tempx2 = tempx1;
            else
                tempx2 = X2arr[1];
        }

        if (Y1arr[0] >= Y2arr[0]) {
            heig1 = Y1arr[0];
        } else {
            heig1 = Y2arr[0];
        }
        if (Y1arr[1] <= Y2arr[1]) {
            if (Y1arr[1] < heig1)
                heigh2 = heig1;
            else
                heigh2 = Y1arr[1];
        } else {
            if (Y2arr[1] < heig1)
                heigh2 = heig1;
            else
                heigh2 = Y2arr[1];
        }

        return ((X1arr[1] - X1arr[0]) * (Y1arr[1] - Y1arr[0])) + ((X2arr[1] - X2arr[0]) * (Y2arr[1] - Y2arr[0]))
                - ((tempx2 - tempx1) * (heigh2 - heig1));
    }

    void fullarr(int f, int s, int[] arr) {
        if (f <= s) {
            arr[0] = f;
            arr[1] = s;
        }

        else {
            arr[0] = s;
            arr[1] = f;

        }
    }
}
