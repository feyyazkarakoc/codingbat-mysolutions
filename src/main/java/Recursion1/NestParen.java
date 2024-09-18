package Recursion1;

public class NestParen {

    public static void main(String[] args) {


        System.out.println(nestParen("(())"));
        System.out.println(nestParen("((()))"));
        System.out.println(nestParen("(((x))"));
    }


    //solution

   /* public static boolean nestParen(String str) {

        if (str.isEmpty()) return true;

        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return nestParen(str.substring(1, str.length() - 1));
        }

        return false;

    }*/

    public static boolean nestParen(String str) {

        if (str.length() > 0 && (!str.startsWith("(") || !str.endsWith(")"))) return false;

        if (str.startsWith("(") && str.endsWith(")")) {
            return nestParen(str.substring(1, str.length() - 1));
        }

        return true;

    }

}
