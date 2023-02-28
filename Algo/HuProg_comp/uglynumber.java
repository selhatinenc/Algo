public class uglynumber {
    public static void main(String[] args) {
        as s = new as();
        System.out.println(s.isUgly(-2147483648));
    }
}

class as {
    public boolean isUgly(int n) {
        if (n < 0)
            n = -n;
        System.out.println(n);
        while (n % 2 == 0)
            n /= 2;
        while (n % 3 == 0)
            n /= 3;
        while (n % 5 == 0)
            n /= 5;
        if (n < 6)
            return true;
        else
            return false;
    }
}