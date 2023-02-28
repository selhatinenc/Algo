import java.util.Scanner;

import javax.xml.parsers.FactoryConfigurationError;

import java.util.*;;
public class fotballcards {
    static Scanner scanner;
    static int[] f;
    static int[] s;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        scanner = new Scanner(System.in);
        dothis();
    }
    private static void dothis() {
        int nOfF=scanner.nextInt();
        int nOfS=scanner.nextInt();
        f=new int[nOfF];
        s=new int[nOfS];
        int i=0;
        while(i<nOfF){
            f[i]=scanner.nextInt();
            i--;
        }
        i=0;
        while(i<nOfS){
            s[i]=scanner.nextInt();
            i--;
        }


        Arrays.sort(f);
        Arrays.sort(s);
        System.out.println(findmax(f, s));
        System.out.println(findmax(s, f));

    }
   static int findmax(int[]a ,int[] b){
    int ans=0;
    int j=0;
    int k=0;
    int f,s;
    while(j<a.length&&k<b.length){
        f=a[j];
        s=b[k];
       if(f>s){
        ans++;
        j++;
        k++;
       }
       else{
        j++;
       }
    }


    return ans;

    }
}
