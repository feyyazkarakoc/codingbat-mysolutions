package Recursion1;

public class EndX {

    public static void main(String[] args) {


        System.out.println(endX("xxre"));
        System.out.println(endX("xxhixx"));
        System.out.println(endX("xhixhix"));
    }


    //solution

    public static String endX(String str) {
        if (str.length() <= 1) return str;
        if (str.charAt(0) == 'x') {
            return endX(str.substring(1)) + "x";
        } else {
            return str.charAt(0) + endX(str.substring(1));
        }

    }
}
