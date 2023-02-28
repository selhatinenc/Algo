import java.util.*;;

public class uglynumber2 {

    public static void main(String[] args) {
        doit d = new doit();
        System.out.println(d.nthUglyNumber(10));
    }

}

class doit {
    public int nthUglyNumber(int n) {
        int five = 0;
        int two = 0;
        int three = 0;
        int min;
        int valtwo;
        int valthree;
        int valfive;
        int a = n;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        while (n --> 1) {
           
            valtwo = arr.get(two) * 2;
            valthree = arr.get(three) * 3;
            valfive = arr.get(five) * 5;
            min = Math.min(valfive, Math.min(valthree, valtwo));
            if (min == valtwo)
                two++;
             if (min == valthree)
                three++;
             if (min == valfive)
                five++;

            arr.add(min);
           // System.out.println(min);
        }

        return arr.get(a - 1);
    }
    public int nthUglyNumbera(int n) {
        int twoin=0;
        int threein=0;
        int fivein=0;
        int temp=n;
        List<Integer>list=new ArrayList<>();
        list.add(1);
        while(temp-- >1){
            int by2=list.get(twoin)*2;
            int by3 =list.get(threein)*3;
            int by5 = list.get(fivein)*5;
            
            int min = Math.min(by2,Math.min(by3,by5));
            list.add(min);
            if(min==by2)twoin++;
            if(min==by3)threein++;
            if(min==by5)fivein++;
            System.out.println(min);
        }
        return list.get(n-1);
    }
}
