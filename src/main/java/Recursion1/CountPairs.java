package Recursion1;

public class CountPairs {

    public static void main(String[] args) {


        System.out.println(countPairs("axa"));
        System.out.println(countPairs("axax"));
        System.out.println(countPairs("axbx"));
    }


    //solution

    public static int countPairs(String str) {
        if (str.length() <= 2) return 0;
        if (str.charAt(0) == str.charAt(2)) {
            return 1 + countPairs(str.substring(1));
        } else {
            return countPairs(str.substring(1));
        }
    }

}
