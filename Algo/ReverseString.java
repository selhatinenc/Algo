
class ReverseString {
    static String subString;

    public static void main(String[] args) {

        System.out.println(ReverseString("selo"));

    }

    static String ReverseString(String str) {
        if (str.equals(""))
            return "";
        else {
            subString = new StringBuffer(str).substring(1);
            return ReverseString(subString) + str.split("")[0];

        }

    }

}
