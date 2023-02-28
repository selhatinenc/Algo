import java.io.*;
import java.util.*;
public class egolift {
    static Scanner scanner;
    static int[] arr;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        while(n-->0){
          System.out.println( dothis());

        }
    }
    private static boolean dothis() {
        int f,s;
        int sOfArr=scanner.nextInt();
        arr=new int[sOfArr];
        int i=0;
        while(i<sOfArr){
            arr[i]=scanner.nextInt();
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            for (int k=j+1; k < arr.length; k++) {
                f=arr[j];
                s=arr[k];
                if(f>s){
                    if(f%s==0&& f/s==5)return true;
                }
                else if(s>f){
                    if(s%f==0&& s/f==5)return true;
                }
                
            }
        }


        return false;

    }

}
