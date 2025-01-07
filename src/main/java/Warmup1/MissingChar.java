package Warmup1;

public class MissingChar {

    public static void main(String[] args) {

        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));
    }



    // solution 1 :
    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);

    }



    // solution 2 :
    /*public static String missingChar(String str, int n) {

        return new StringBuilder(str).deleteCharAt(n).toString();
    }*/



    /*public static String missingChar(String str, int n) {

        return new StringBuilder(str).deleteCharAt(n).toString();
    }*/
}
