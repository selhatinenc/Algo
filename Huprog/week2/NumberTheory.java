public class NumberTheory {


    public static final int MOD = 1000000007;
    // Competitive programmingde buyuk sayilarla islem yapmaniz gerektiginde
    // (sayi cogu durumda 64 bit olan long'un max degerini bile fazlasiyla
    // astigi icin)
    // sonuc olarak
    // sayiyi dondurme yerine


    // recursive factorial fonksiyonu buyuk degerler icin bellek asimina sebep olabilir.
    // Fonksiyonun recursive olmayan hali Factorial.java dosyasinda mevcut.
    public static int factorial(int n, int mod){
        if(n < 2){
            return 1;
        }

        // n'i long'a castledik cunku factorial(n-1, mod) degeri 2^31-1'e yakin
        // bir deger olursa n ile carptigimizda overflow olma riski var.
        return (int)((long)n * factorial(n-1, mod) % mod);

    }

    public static void main(String[] args) {

        // bir sayiyi 2'nin kuvvetleriyle carpma ve bolmek icin
        // klasik carpma ve bolme islemleri yerine bit kaydirma islemleri kullanilabilir.
        System.out.println("5 * 2^3 = " + (5 << 3));

        // bir sayiyi 2'nin kuvvetleriyle carpma ve bolmek icin
        System.out.println("21 / 2^3 = " + (21 >> 3));


        System.out.println("Factorial operation with large prime mod");
        for (int i = 0; i < 50; i++) {
            System.out.println("Factorial: " + i + " " + factorial(i, MOD));
        }

        System.out.println("Factorial operation with large but non prime mod");

        // 1 << 30 = 2^30
        for (int i = 0; i < 50; i++) {
            System.out.println("Factorial: " + i + " " + factorial(i, 1 << 30));
        }

    }
}
