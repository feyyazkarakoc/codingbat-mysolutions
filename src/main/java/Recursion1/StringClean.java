package Recursion1;

public class StringClean {

    public static void main(String[] args) {


        System.out.println(stringClean("yyzzza"));
        System.out.println(stringClean("abbbcdd"));
        System.out.println(stringClean("Hello"));
    }


    //solution

    public static String stringClean(String str) {
        if (str.length() <= 1) return str;
        if (str.charAt(1) != str.charAt(0)) {
            return str.charAt(0) + stringClean(str.substring(1));
        } else {
            return stringClean(str.substring(1));
        }
    }

}
