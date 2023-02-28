import java.io.*;
import java.util.*;

public class Solution {

    static Scanner scanner;
    static String[] arr;
    static HashMap<String,Integer> hash=new HashMap<>();
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        scanner = new Scanner(System.in);
        dothis();
    }
    public static boolean contarr(String c,int a){
        try{
        for (int i = 0; i < a; i++) {
            if(arr[i].equals(c)){
                if(hash.get(c)>1){
                    return true;
                }
                else{
                    hash.replace(c, hash.get(c), hash.get(c)+1);
                    return false;
                }
                
        }
        }
            }
        catch(Exception e){
            
        }
        hash.put(c,1);
        return false;
    }

    private static void dothis() {
        ArrayList<String> ans = new ArrayList();
        int n = scanner.nextInt();
         arr = new String[n];
        int i = 0;
        String q;
        int a=0;
        while (i < n) {
            q = scanner.next();
            if(! contarr(q,a)){
                
                arr[a]=q;
                    a++;
           }
            i++;
        }
        for (int j = 0; j < a; j++) {
            for (int j2 = j + 1; j2 < a; j2++) {
                if(arr[j2].length()>=arr[j].length()){
                    
                
                    if (arr[j2].contains(arr[j])&&!ans.contains(arr[j]))
                        ans.add(arr[j]);
                    }
                else if(arr[j2].length()<arr[j].length())
                    if (arr[j].contains(arr[j2])&&!ans.contains(arr[j2]))
                        ans.add(arr[j2]);
                    // System.out.println(arr[j]);
                
            }
        }
        Collections.sort(ans);

        String print = "[";
        for (int j = 0; j < ans.size(); j++) {
            print += "\'" + ans.get(j) + "\'";
            if (j != ans.size() - 1) {
                print += ", ";
            } else {

            }
        }
        print += "]";
        System.out.println(print);
    }
}