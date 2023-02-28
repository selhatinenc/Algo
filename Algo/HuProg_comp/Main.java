
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {    static Scanner scanner;

    public static void main (String[] args) {
        scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        scanner.next();
        long m=scanner.nextLong();
        long sum=0;
        sum+=(n-1)*m;
        while(n>1){
            sum+=scanner.nextLong();
        }
        System.out.println(sum);

    }
}
