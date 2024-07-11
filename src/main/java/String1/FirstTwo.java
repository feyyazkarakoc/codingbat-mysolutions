package String1;

public class FirstTwo {

    public static void main(String[] args) {

        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo("ab"));

    }


    //solution

    public static String firstTwo(String str) {

        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);

    }
}
