import java.util.Scanner;
import java.util.*;;

class q2 {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println(ans());

    }

    static int ans() {

        int leng;
        int num = 0;
        String word = scanner.nextLine();
        leng = word.length();
        int[] arr = new int[leng];

        int x = scanner.nextInt();
        if (leng == 0 || x == 0)
            return 0;
        if (x == 1)
            return 1;
        if (num == 1)
            return x;
        while (true) {
            num++;
            if (x <= Math.pow(num, leng)) {
                break;

            }

        }
        num--;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num;
        }
        dothis(arr, x);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;

    }

    static int[] dothis(int[] arr, int x) {

        int mult = 1;

        for (int i = 0; i < arr.length; i++) {
            mult *= arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (mult > x)
                break;
            int before = arr[i];
            arr[i]++;
            mult /= before;
            mult *= arr[i];
            if (mult >= x)
                break;

        }

        return arr;

    }

}
