import java.util.Scanner;
import java.util.*;;

class q1 {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println(ans());

    }

    static int ans() {
        int sum = 0;

        int x, y = 0;
        int max = 0;
        x = scanner.nextInt();
        max = (x > max) ? x : max;
        y = x;
        while (x > 0) {
            x--;
            sum += scanner.nextInt();

        }
        sum += scanner.nextInt();
        if (max > (sum / y)) {
            return 0;
        }

        return (sum % y == 0) ? 1 : 0;

    }

}
