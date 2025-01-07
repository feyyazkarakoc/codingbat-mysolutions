package Warmup1;

public class FrontBack {

    public static void main(String[] args) {

        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ba"));
    }



    // solution :
    public static String frontBack(String str) {
        int len = str.length();
        return len > 1
                ? str.charAt(len - 1) + str.substring(1, len - 1) + str.charAt(0)
                : str;

    }




}
