package Recursion1;

public class AllStar {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 20};
        int[] arr2 = {3, 30};
        int[] arr3 = {3};

        System.out.println(allStar("hello"));
        System.out.println(allStar("abc"));
        System.out.println(allStar("ab"));
    }


    //solution

    public static String allStar(String str) {
        if (str.length() <= 1) return str;
        return str.charAt(0) + "*" + allStar(str.substring(1));

    }
}
