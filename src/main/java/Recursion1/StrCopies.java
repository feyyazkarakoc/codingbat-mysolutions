package Recursion1;

public class StrCopies {

    public static void main(String[] args) {


        System.out.println(strCopies("catcowcat", "cat", 2));
        System.out.println(strCopies("catcowcat", "cow", 2));
        System.out.println(strCopies("catcowcat", "cow", 1));
    }


    //solution

    public static boolean strCopies(String str, String sub, int n) {

        if (n <= 0) return true;

        if (str.length() < sub.length()) return false;

        if (str.startsWith(sub)) {
            return strCopies(str.substring(1), sub, n - 1);
        } else {
            return strCopies(str.substring(1), sub, n);
        }

    }
}
