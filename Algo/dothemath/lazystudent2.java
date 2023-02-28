import javax.xml.parsers.FactoryConfigurationError;

import java.util.*;;

public class lazystudent2 {

    static Scanner scanner;
    static ArrayList<String> ans;
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        scanner = new Scanner(System.in);
        dothis();
    }

    private static void dothis() {
         ans = new ArrayList();
        int n = scanner.nextInt();
        HashMap<Character,ArrayList<String>> hashMap=new HashMap<>();
       // String[] arr = new String[n];
        int i = 0;
        String str;
        ArrayList<String> arr;
        char x;
        while (i < n) {
            str=scanner.next();
            x=str.charAt(0);
            if(hashMap.containsKey(x)){
                hashMap.get(x).add(str);
            }
            else{
                arr=new ArrayList<>();
                arr.add(str);
                hashMap.put(x, arr);
            }
           // arr[i] = scanner.next();
            i++;

        }
        for (ArrayList<String> array : hashMap.values()) {
            findAll(array);
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

    private static void findAll(ArrayList<String> arr) {
        for (int j = 0; j < arr.size(); j++) {
            for (int j2 = j + 1; j2 < arr.size(); j2++) {
                  if(!arr.contains(arr.get(j)))
                    if(arr.get(j2).length()>=arr.get(j).length())
                    if (arr.get(j2).substring(0, arr.get(j).length()).equals(arr.get(j)))
                        ans.add(arr.get(j));
                    // System.out.println(arr[j]);
                
            }
        }
    }
}