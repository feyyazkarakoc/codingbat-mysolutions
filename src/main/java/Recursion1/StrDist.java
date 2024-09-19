package Recursion1;

public class StrDist {

    public static void main(String[] args) {


        System.out.println(strDist("catcowcat", "cat"));
        System.out.println(strDist("catcowcat", "cow"));
        System.out.println(strDist("cccatcowcatxx", "cat"));
    }


    //solution

    public static int strDist(String str, String sub) {

        if (str.length() < sub.length()) return 0;

        if (!str.startsWith(sub)) {
            return strDist(str.substring(1), sub);
        }

        if (!str.endsWith(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        }

        return str.length();
    }






   /* public static int strDist(String str, String sub) {

        if (str.length() < sub.length()) return 0;
        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        } else if (str.startsWith(sub) && !str.endsWith(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        } else if (!str.startsWith(sub) && str.endsWith(sub)) {
            return strDist(str.substring(1), sub);
        } else if (str.length() > 2) {
            return strDist(str.substring(1, str.length() - 1), sub);
        } else {
            return 0;
        }
    }*/
}
