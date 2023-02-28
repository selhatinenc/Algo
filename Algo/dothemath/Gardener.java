import java.util.Scanner;

import javax.xml.parsers.FactoryConfigurationError;

import java.util.*;;

public class Gardener {
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
        int m=scanner.nextInt();
        int[] arr1=new int[m];
        int i=0;
        int input;
        int nOfFL=0;
        int nOfSL=0;
        while(i<m){
            input=scanner.nextInt();
            arr1[i]=input;
            nOfFL+=input;
            nOfSL+=input-1;
            i++;
        }
        int [] FL=new int[nOfFL];
        int[] SL=new int[nOfSL];
        i=0;
        while(i<nOfFL){
            FL[i]=scanner.nextInt();
            i++;
        }
        i=0;
        while(i<nOfSL){
            SL[i]=scanner.nextInt();
            i++;
        }
        int j=0;
        int q=0;
        while(j<nOfSL){
            if(FL[q]==SL[j]){
                j++;
                q++;
            }
            else{
                System.out.print(FL[q]+" ");
                q++;
            }
        }

        
    }
}