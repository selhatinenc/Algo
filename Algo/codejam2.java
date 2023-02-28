import java.util.ArrayList;
import java.util.Scanner;

public class codejam2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tryy = scanner.nextInt();
        int n = 0;
        while (tryy > 0) {
            n++;
            tryy--;
            scanner.nextLine();
            func(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), n);

        }

    }

    static void func(String s, String f, String t, int casen) {

        Integer[] fint = new Integer[3];
        Integer[] sint = new Integer[3];
        Integer[] tint = new Integer[3];
        Integer[] ftint = new Integer[3];
        String[] ss = s.split(" ");
        String[] ff = f.split(" ");
        String[] tt = t.split(" ");

        fint[0] = Integer.parseInt(ss[0]);
        fint[1] = Integer.parseInt(ff[1]);
        fint[2] = Integer.parseInt(tt[2]);

        sint[0] = Integer.parseInt(ss[0]);
        sint[1] = Integer.parseInt(ff[1]);
        sint[2] = Integer.parseInt(tt[2]);

        tint[0] = Integer.parseInt(ss[0]);
        tint[1] = Integer.parseInt(ff[1]);
        tint[2] = Integer.parseInt(tt[2]);

        ftint[0] = Integer.parseInt(ss[0]);
        ftint[1] = Integer.parseInt(ff[1]);
        ftint[2] = Integer.parseInt(tt[2]);

        for (Integer integer : fint) {
            if (integer > 1000000)
                continue;
            else
                for (Integer integer2 : tint) {
                    if (integer2 > 1000000)
                        continue;
                    else
                        for (Integer integer3 : sint) {
                            if (integer3 > 1000000)
                                continue;
                            else {
                                for (Integer integer4 : ftint) {

                                    if (integer4 > 1000000)
                                        continue;
                                    else {
                                        if (integer + integer2 + integer3 + integer4 == 1000000) {

                                            System.out.println(
                                                    "Case #" + casen + ": " + integer + " " + integer3 + " " + integer2
                                                            + " " + integer4);
                                            return;
                                        }

                                    }

                                }
                            }
                        }
                }
        }
        System.out.println("Case #" + casen + ": " + "IMPOSSIBLE");

    }

    static Integer[] arr(String x) {
        String[] s = x.split(" ");
        Integer[] i = new Integer[4];
        for (int j = 0; j < s.length; j++) {
            i[j] = Integer.parseInt(s[j]);
        }
        return i;

    }
}