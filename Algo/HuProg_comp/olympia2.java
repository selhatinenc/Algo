import java.util.Scanner;

import javax.xml.parsers.FactoryConfigurationError;

import java.util.*;;

class prison {

    static Scanner scanner;
    static boolean cont=true;
    static String beforestr;
    static   String f,s="";
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println(ans());

    }

    static int ans() {
       
      
        int n=scanner.nextInt();
        f=scanner.next();
        while(n>1){
            n--;
            if(!s.equals(""))
                f=s;
            s=scanner.next();
            rec();

        }
        return 0;
    }
    static void rec(){
        if(f.equals(s)) cont= false;
        else if (cont=false);
        else {
            beforestr=f;
            cont=true;
            System.out.print(f+" ");
        }
    }
}