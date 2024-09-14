package Recursion1;

public class Count11 {

    public static void main(String[] args) {


        System.out.println(count11("11abc11"));
        System.out.println(count11("abc11x11x11"));
        System.out.println(count11("111"));
    }


    //solution

    public static int count11(String str) {
        if (str.length() < 2) return 0;
        if (str.startsWith("11")) {
            return 1 + count11(str.substring(2));
        } else {
            return count11(str.substring(1));
        }
    }
}
