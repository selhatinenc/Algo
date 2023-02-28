import java.util.*;;
class Main {

    static Scanner scanner;
    static int[] primelist;
    static int index=0;
    static int n;
    public static void main(String[] args) {
        scanner=new Scanner(System.in);
        n=scanner.nextInt();
        primelist=new int[1];
        countPrimes(((int)Math.pow(10, 4)/2));           
         for(Integer i: primelist)
             System.out.println(i);



    ans();        
    }
    static int ans(){
        Stack<Integer> aStack=new Stack<>();
        Stack<Integer> bstack=new Stack<>();
        int i;
        scanner.nextInt();
        while(n>0){
            n--;
            aStack.push(scanner.nextInt());
        }
        Stack<Integer> cStack=new Stack<>();
        Stack<Integer> dStack=new Stack<>();
        dStack.addAll(aStack);
        boolean one=true;
        for (int j : primelist) {
                     //     System.out.println(j);

            cStack.clear();
            if(dStack.isEmpty()) break;
            if(one==false){
            aStack.addAll(dStack);
            }
           one= false;
            int x=aStack.size();
            while (x>0) {
                
                x--;
                Integer integer=aStack.peek();; aStack.pop();
               // System.out.println(integer);
                if(integer%j==0 ){

                   cStack.push(integer);
                    bstack.push(integer);
                }
            }

            dStack.removeAll(cStack);
        }
        for (Integer integer : bstack) {
            System.out.println(integer);
        }

        return 0;
    }
  static  int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++)
            if (isPrime(i)) count++;
        return count;
    }
    
    // Determines whether integer n is prime
    static  boolean isPrime(int n) {
        for (int i = 2; i < n; i++)
            if (n % i == 0){
                
                // There are other divisibility factors
                return false;
            }
            primelist[index]=n;
            index++;
            //System.out.println(n);
        return true;
    }
}