package Recursion1;

public class ChangeXY {

    public static void main(String[] args) {

        System.out.println(changeXY( "codey"));
        System.out.println(changeXY("xxhixx"));
        System.out.println(changeXY("xhixhix"));
    }


    //solution

    public static String changeXY(String str) {
        if (str.isEmpty()) return "";
        return (str.startsWith("x") ? "y" : str.charAt(0)) + changeXY(str.substring(1));


    }
}
