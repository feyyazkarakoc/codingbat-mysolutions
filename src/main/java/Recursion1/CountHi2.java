package Recursion1;

public class CountHi2 {


    public static void main(String[] args) {


        System.out.println(countHi2("ahixhi"));
        System.out.println(countHi2("ahibhi"));
        System.out.println(countHi2("xhixhi"));
    }


    //solution

    public static int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }

        if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2));
        }

        if (str.length() >= 3 && str.charAt(0) == 'x' && str.substring(1, 3).equals("hi")) {
            return countHi2(str.substring(3));
        }

        return countHi2(str.substring(1));
    }
}

