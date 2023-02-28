
import java.util.*;
import java.lang.*;
import java.io.*;
public class Combination {
    static Scanner in;

    int x,y,z,w,h,x2,y2,w2,h2;
    private static int print_menu(){
        System.out.println("1. Prime Numbers\n
        2. Volume Filling\n
        3. Union Area\n
        4. Random Questions\n
        5. Exit\n
        Please enter your choice: 
        ");
    }
    public static void main(String[] args) {
      in=new Scanner(System.in);  

      while(true){  
      int choice=print_menu();
       start(choice);
    }
    }
    private static void start(int choice){
        switch (choice) {
            case 1:
                prime_numbers();
                break;
            case 2:
                volume_filling();
                break;
            case 3:
                Union_area();
                break;
            case 4:
                Random_Questions(); 
                break;
            
            case 5:
            System.out.println("Goodbye!");
            System.Exit(0);
            break;
           
           }
    }
    private static void  Random_Questions(){
        System.out.println("- Please enter the number of questions you want: ");
        int q=in.nextInt();
        Random random = new Random();
        while(q-->0){
            int rand=random.nextInt(4);
            if(rand==1) create_union_area_question();
            else if(rand==2)create_volume_filling_Q();
            else create_prime_number_Q();

        }

    }
    private static void  create_union_area_question(){
        Random random = new Random();

        x=random.nextInt(101);
        y=random.nextInt(101);
        x2=random.nextInt(101);
        y2=random.nextInt(101);
        w=random.nextInt(101);
        h=random.nextInt(101);
        w2=random.nextInt(101);
        h2=random.nextInt(101);
     
        System.out.println("   - What is the area of the union of two rectangles R1 and R2, where top left
        corner of R1 is (%d,%d) and its size is (%d,%d), and top left corner of R2 is
        (%d,%d) and its size is (%d,%d)? ",x,y,w,h,x2,y2,w2,h2);    
        int x_range,y_range;
        if(x<x2){
            x_range=find_range(x,x+w,x2,x2+w2);
        }
        else{
            x_range=find_range(x2,x2+w2,x,x+w);

        }
        if(y<y2){
            y_range=find_range(y,y+h,y2,y2+h2);
        }
        else{
            y_range=find_range(y2,y2+h2,y,y+h);

        }
        int common_area=y_range*x_range;
        int total_area=(w*h)+(w2*h2);
        System.out.println("Result: Intersection area is %d thus the total area of the union is %d.",common_area,total_area-common_area);
        
    }

    private static void  create_volume_filling_Q(){
        x=random.nextInt(25);
        y=random.nextInt(25);
        z=random.nextInt(25);
        System.out.println("   - A rectangular prism volume of dimensions %d, %d and %d is to be filled using
        cube blocks. What is the minimum number of cubes required? ",x,y,z); 
        int edge_length=recursiveEuclidGcd(x,recursiveEuclidGcd(y,z));
        int number_block=(x*y*z)/Math.pow(edge_length,3);
         System.out.printIn(   " Result: Using cubes of edge length %d you need %d blocks minimum.",edge_length,number_block);



    }
    private static void  create_prime_number_Q(){
        x=random.nextInt(20);
        y=random.nextInt(100);
        y+=20;
        System.out.println("   - Find the prime numbers in the range between %d and %d.
        ",x,y);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        boolean is_prime=true;
        if(x<3)arr.add(2);
        if(x%2==0)x++;
        for(int i=x; i<y+1;x+=2){
            for(int y=3;y<=Math.sqrt(i);y+=2){
                if(i%y==0){
                    is_prime=false;
                    break;
                }
            }
            if(is_prime==true){
                arr.add(i);

            }
            is_prime=true;

        }
        System.out.println("Result: Prime numbers in range ["+Integer.toString(x)+","+Integer.toString(y)+"]");
        for (Integer i : arr) {
            System.out.print(Integer.toString(i)+",");
          }
    }
    private static int find_range(s1,f1,s2,f2){
        int ans=f1-s2;
        if(ans<0)return0;
        return ans;
    }
    private static void Union_area(){
        System.out.println("- What is the area of the union of two rectangles R1 and R2, where top left
        corner of R1 is (X1,Y1) and its size is (W1,H1), and top left corner of R2
        is (X2,Y2) and its size is (W2,H2)?
        Please enter X1, Y1, W1, H1, X2, Y2, W2, H2: ");
        x=in.nextInt();
        y=in.nextInt();
        x2=in.nextInt();
        y2=in.nextInt();
        w=in.nextInt();
        h=in.nextInt();
        w2=in.nextInt();
        h2=in.nextInt();
        int x_range,y_range;
        if(x<x2){
            x_range=find_range(x,x+w,x2,x2+w2);
        }
        else{
            x_range=find_range(x2,x2+w2,x,x+w);

        }
        if(y<y2){
            y_range=find_range(y,y+h,y2,y2+h2);
        }
        else{
            y_range=find_range(y2,y2+h2,y,y+h);

        }
        int common_area=y_range*x_range;
        int total_area=(w*h)+(w2*h2);
        System.out.println("Result: Intersection area is %d thus the total area of the union is %d.",common_area,total_area-common_area);
        

    }
    private static void prime_numbers(){
        System.out.println("-Find the prime numbers in the range between X and Y.
        Please enter X, Y: ");
        x=in.nextInt();
        y=in.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        boolean is_prime=true;
        if(x<3)arr.add(2);
        if(x%2==0)x++;
        for(int i=x; i<y+1;x+=2){
            for(int y=3;y<=Math.sqrt(i);y+=2){
                if(i%y==0){
                    is_prime=false;
                    break;
                }
            }
            if(is_prime==true){
                arr.add(i);

            }
            is_prime=true;

        }
        System.out.println("Result: Prime numbers in range ["+Integer.toString(i)+","+Integer.toString(i)+"]");
        for (Integer i : arr) {
            System.out.print(Integer.toString(i)+",");
          }
       //   System.out.println("Result: Prime numbers in range [");

        }

        private static void volume_filling(){
            
        System.out.printIn("- A rectangular prism volume of dimensions X, Y and Z is to be filled using
        cube blocks. What is the  minimum number of cubes required?
        Please enter X, Y, Z: ");
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        int edge_length=recursiveEuclidGcd(x,recursiveEuclidGcd(y,z));
        int number_block=(x*y*z)/Math.pow(edge_length,3);
         System.out.printIn(   " Result: Using cubes of edge length %d you need %d blocks minimum.",edge_length,number_block);




        }



        private static int recursiveEuclidGcd(int a, int b){
            if(b == 0) return a;
            return recursiveEuclidGcd(b, a%b);
        }
        
    
    
}