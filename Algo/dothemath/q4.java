import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;;

class q4 {
     static Scanner scanner;

    public static void main(String[] args) {
        scanner=new Scanner(System.in);
        ans2();
    }

    








    static int ans2() {
        
        int k,n,m;
        k=scanner.nextInt();// 10 TO POWER 4
        n=scanner.nextInt();// 10 TO POWER 6
        m=scanner.nextInt();
        int whi=0;
       int[] arr=new int[n];
       
       ArrayList<Integer> array=new ArrayList<>();
        while(whi<n){
            arr[whi]=scanner.nextInt();
            whi++;


        }
       
        int b,m2,d;
        
    
        while(k>0){
            int mama=1;
            b=scanner.nextInt();
            m2=scanner.nextInt();
            d=scanner.nextInt();

            k--;
            b--;
            
            int query=0;
            int sum=0;
            d--;
            int firstind=d;
            int last=n-1;
            while(query<m){
                query++;
                if(d==n) {
                    last=n-1;
               
                    break;}
                sum+=arr[d];
            

               
                d++;
            }
            while(m2>0){
                if(b==n)b=0;
                if(m2>mama){
                    if(b>=firstind && b<=last) sum+=mama;
                    m2-=mama;
                    
                }
                else {
                    if(b>=firstind && b<=last) sum+=m2;
                    m2=0;
                }
                b++;
                mama++;

            }
            
            array.add(sum);

        }
        for (Integer i : array) {
            System.out.print(i+" ");
        }


        return 0;
    }


}
