package Recursion1;

public class ParentBit {


    public static void main(String[] args) {


        System.out.println(parenBit("xyz(abc)123"));
        System.out.println(parenBit("x(hello)"));
        System.out.println(parenBit("(xy)1"));
    }


    //solution

    public static String parenBit(String str) {
        if (str.startsWith(")")) return ")";
        if (str.startsWith("(")) {
            return str.charAt(0) + parenBit(str.substring(1));
        } else if (str.contains(")") && !str.contains("(")) {
            return str.charAt(0) + parenBit(str.substring(1));
        } else {
            return parenBit(str.substring(1));
        }
    }


   /* public static String parenBit(String str) {
        if (str.charAt(0) != ('(')) {
            return parenBit(str.substring(1));
        }
        if (str.charAt(str.length() - 1) != ')') {
            return parenBit(str.substring(0, str.length() - 1));
        }
        return str;
    }*/
}
