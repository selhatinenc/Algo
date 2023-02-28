import javax.xml.parsers.FactoryConfigurationError;

import java.util.*;;

public class Worm {
    static Scanner scanner;
    static int sizeofstr;
    static String str;
    // static HashMap<Character, int[]> hashMap;

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        scanner = new Scanner(System.in);
        dothis();
    }

    private static void dothis() {
        str = scanner.nextLine();
        sizeofstr = str.length();
        int ans = 0;
        int prevoffirst = 0;
        int prevoflast = str.lastIndexOf(str.charAt(0));
        int first, last;
        int currfirst = 0;
        for (int i = 1; i < sizeofstr; i++) {

            first = str.indexOf(str.charAt(i));
            last = str.lastIndexOf(str.charAt(i));
            if (first == last) {
                ans++;
                if (i < sizeofstr - 1) {
                    currfirst = i + 1;
                    prevoffirst = i + 1;
                    prevoflast = str.lastIndexOf(str.charAt(i + 1));
                }
            } else if (first >= prevoffirst) {
                if (last <= prevoflast) {
                    // System.out.println("prev of last Char:"+str.charAt(last));

                    if (i == prevoflast) {
                        // System.out.println("Char:"+str.charAt(i));
                        // cout<<"Char"<<str.charAt(i);
                        ans++;
                        if (i < sizeofstr - 1) {
                            currfirst = first;
                            prevoffirst = i + 1;
                            prevoflast = str.lastIndexOf(str.charAt(i + 1));
                        }

                    } else if (i < prevoflast && first > currfirst) {
                        currfirst = first;
                        prevoffirst = first;
                        prevoflast = last;

                    }

                } else {
                    currfirst = first;
                    prevoflast = last;
                }

            } else if (first < prevoffirst) {
                if (i < sizeofstr - 1) {
                    currfirst = i + 1;
                    prevoffirst = i + 1;
                    prevoflast = str.lastIndexOf(str.charAt(i + 1));
                }
            }

        }
        if (ans == 0)
            ans = 1;
        System.out.println(ans);
    }

}
/*
 * for (int[] i : hashMap.values()) {
 * for (int j : i) {
 * System.out.println(j);
 * }
 * }
 * 
 * private static void dothis() {
 * str = scanner.next();
 * hashMap = new HashMap();
 * Character c;
 * sizeofstr=str.length();
 * int[] arr = new int[2];
 * for (int i = 0; i < str.length(); i++) {
 * c = str.charAt(i);
 * if (hashMap.containsKey(c)) {
 * hashMap.get(c)[1] = i;
 * 
 * } else {
 * arr = new int[2];
 * arr[0] = i;
 * arr[1]=i;
 * hashMap.put(c, arr);
 * }
 * }
 * int max=-1;
 * for (int i = 0; i < str.length(); i++) {
 * c=str.charAt(i);
 * if(!usednumbers.contains(c)){
 * usednumbers.add(c);
 * arr=hashMap.get(c);
 * 
 * int r= sendindex(arr[1]+1)+1;
 * if(r>max)max=r;
 * }
 * else{
 * i++;
 * }
 * 
 * 
 * }
 * System.out.print(max);
 * 
 * 
 * }
 * 
 * private static int sendindex(int i) {
 * if(i<sizeofstr){
 * temparr= hashMap.get(str.charAt(i));
 * if(temparr[0]<i){
 * return sendindex(i+1);
 * }
 * else{
 * return 1+sendindex(temparr[1]+1);
 * }
 * 
 * }
 * return 0;
 * }
 * 
 * 
 */