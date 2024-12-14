package Warmup2;

public class StringTimes2 {

    public static void main(String[] args) {

        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));

    }


    public static String stringTimes(String str, int n) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(str);

        }

        return sb.toString();

    }


    /*public static String stringTimes(String str, int n) {

        return str.repeat(n);

    }*/





}
