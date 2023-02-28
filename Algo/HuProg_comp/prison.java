import java.util.Scanner;
import java.util.*;;

class prison {

    static Scanner scanner;
    static int n, m, q, i, ans, anslistsize;
    static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        ans();
    }

    static void ans() {

        q = scanner.nextInt();
        while (q > 0) {
            q--;
            n = scanner.nextInt();
            m = scanner.nextInt();

            findAllProblems();
        }

    }

    private static void findAllProblems() {
        i = 0;
        ans = 0;
        anslistsize = 0;
        ArrayList<Integer> newlist = new ArrayList<>();
        list = new ArrayList<>();
        while (m > 0) {
       //     System.out.println(ans);
            m--;
            
            int firstPrison = scanner.nextInt();
            int secPrison = scanner.nextInt();
            int f = elementcontrol(firstPrison);
            int s = elementcontrol(secPrison);
           // System.out.println("f:"+f+" s:"+s);
            if (f == -1 && s == -1) {
                newlist.clear();
                newlist.add(firstPrison);
                newlist.add(secPrison);
                list.add(newlist);
                ans += 2;
            } else if (f == -1) {
                list.get(s).add(firstPrison);
                anslistsize = list.get(s).size();
                ans += anslistsize * (anslistsize - 1);
            } else if (s == -1) {
                list.get(f).add(secPrison);
                anslistsize = list.get(f).size();
                ans += (anslistsize * anslistsize - 1);
            } else if (s == f) {
                anslistsize = list.get(f).size();
                ans += (anslistsize * anslistsize - 1);
            } else
                mergetwolist(f, s);
        }
        System.out.println(ans);

    }

    private static void mergetwolist(int f, int s) {
        list.get(f).addAll(list.get(s));
        anslistsize = list.get(f).size();
        ans += (anslistsize * anslistsize - 1);
    }

    private static int elementcontrol(int P) {
        for (ArrayList<Integer> i : list) {
            if (i.contains(P))
                return list.indexOf(i);
        }

        return -1;
    }

}