import java.util.Scanner;

import javax.xml.parsers.FactoryConfigurationError;

import java.util.*;;

public class carddesk {
    static Scanner scanner;

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        scanner = new Scanner(System.in);
        dothis();
    }

    private static void  dothis() {
        int lofarr;
        String[] arr;
        
        int n=scanner.nextInt();
        int index=0;
        String s="";
        while(n-->0){
            
            lofarr=scanner.nextInt();
            arr=new String[lofarr];
            for (int i = 0; i < lofarr; i++) {
                arr[i]=scanner.next();
            }
            scanner.nextLine();
            for (int i = 0; i < arr.length; i++) {
                s="";
                for (int j = i; j < arr.length; j++) {
                    s+=arr[j]+" ";
                    
                }
                
            }

        }
    }
}