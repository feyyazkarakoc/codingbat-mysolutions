package Warmup1;

public class NotString {

    public static void main(String[] args) {

        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));
    }



    // solution :
    public static String notString(String str) {
        return str.length() > 2
                && str.substring(0, 3).equals("not")
                ? str
                : "not " + str;
    }
}
