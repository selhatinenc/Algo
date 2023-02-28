import java.util.Scanner;

import javax.xml.parsers.FactoryConfigurationError;

import java.util.*;;

public class strillgotthepalindrome {
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
        int q=scanner.nextInt();
       
       // scanner.nextLine();
        String s;
        while(q-->0){
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            s=scanner.next();
            kcontrol(s.toCharArray(),n,k,n/2);
        }

    }

    private static void kcontrol(char[] s, int n, int k, int mid) {
        int ans=0;
        //if(n%2==0)
        for(int i=0;i<n-k;i++){
            if(s[i]!=s[i+k]){
                ans++;
             //   int Ifinddist=mid-i-1;
                
               // int kifind=mid-i-k;
                
                    s[i+k]=s[i];
                
               
            
              
            }
        }
        

        System.out.println(ans);
       
        // Pal
        int l=n-1;
        
        for (int i = 0; i < mid; i++) {
            if(s[i]!=s[l])ans++;
            l--;
        }
        System.out.println(ans);

    }

   
}

