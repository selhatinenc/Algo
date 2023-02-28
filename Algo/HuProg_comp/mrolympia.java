import java.util.Scanner;

import javax.xml.parsers.FactoryConfigurationError;

import java.util.*;;

class mrolympia {

    static Scanner scanner;
    static ArrayList<String> arr;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        ans();
    }

    static int ans() {
        int n = scanner.nextInt();
        int i = 0, k = 0, q;

        boolean c = true;
        q = n;
        arr = new ArrayList<>();
        while (n > 0) {
            n--;
            arr.add(scanner.next());

        }
        while (i < arr.size() - 1) {
            int j = i + 1;
            System.out.println(i);
            while (arr.get(i).equals("")) {
                i++;
                if(i==arr.size()) i--;break;
              
            }
            while (arr.get(j).equals(""))
                j++;
            if (!arr.get(i).equals("") && arr.get(i).equals(arr.get(j))) {
                send(i, j);
                arr.set(i, "");
                if (i != 0) {
                    int z = i;
                    while (z > 0) {
                        if (!arr.get(z).equals(""))
                            break;
                        z--;

                    }
                    if (z != 0
                    )
                        z--;
                    i = z;
                }

                // c=false;

            }
            // else if(c==false) c=true;
            else {

                i++;
            }

        }
        for (String string : arr) {
            if (!string.equals(""))
                System.out.print(string);
        }

        return 0;
    }

    private static void send(int x, int y) {
        if (y < arr.size())
            if (arr.get(x).equals(arr.get(y))) {
                arr.set(y, "");
                if (y < arr.size() - 1)
                    send(x, y + 1);
            }
    }
}