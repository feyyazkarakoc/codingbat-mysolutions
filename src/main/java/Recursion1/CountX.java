package Recursion1;

public class CountX {

    public static void main(String[] args) {

        System.out.println(countX("xxhixx"));
        System.out.println(countX("xhixhix"));
        System.out.println(countX("hi"));
    }


    //solution

    public static int countX(String str) {
        if (str.isEmpty()) return 0;
        return (str.startsWith("x") ? 1 : 0) + countX(str.substring(1));

    }
}
