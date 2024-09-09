package Recursion1;

public class CountHi {

    public static void main(String[] args) {

        System.out.println(countHi("xxhixx"));
        System.out.println(countHi("xhixhix"));
        System.out.println(countHi("hi"));
    }


    //solution

    public static int countHi(String str) {
        if (str.length() < 2) return 0;
        return (str.startsWith("hi") ? 1 : 0) + countHi(str.substring(1));

    }


   /* public static int countHi(String str) {
        return countHiHelper(str, 0);

    }

    public static int countHiHelper(String str, int index) {
        if (index > str.length() - 2) return 0;
        return (str.startsWith("hi", index) ? 1 : 0) + countHiHelper(str, index + 1);
    }*/
}
