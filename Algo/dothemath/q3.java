import java.util.Scanner;
import java.util.*;;

class q3 {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println(ans());

    }

    static int ans() {
        int s,t,d,num;
        s=scanner.nextInt();
        t=scanner.nextInt();
        d=scanner.nextInt();
        int[] arr=new int[s];
        num=0;
        
        while(num<s){
            
            arr[num]=scanner.nextInt();
            num++;


        }
        int max=0,curr=0;
        for (int i = 0; i < arr.length; i++) {

            int j=d;          

            int k=i+1;
            while(j>=0){
                if(k>s-1) {break;}
                
                

                else if(arr[i]==arr[k]){
                    System.out.println(k);
                    curr++;
                    k++;
                    if(curr>max){
                        max=curr;
                        
                    
                        }
                         }
                 else {
                    System.out.println("i: " +arr[i]+"k: "+arr[k]);

                      k++;
                      j--;
                      }
    
    }
                 curr=0;



            }
            




return max+1;

}

}
