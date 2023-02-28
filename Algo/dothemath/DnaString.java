import java.io.*;
import java.util.*;

public class Solution {
  static Scanner scanner;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
            scanner = new Scanner(System.in);
            int n=scanner.nextInt();
            int ans=0;
            if(n==0)System.out.println(0);
            else if(n==1)System.out.println(1);
            else{
                ans+=1+((n/3)*2);
            }
        }
}