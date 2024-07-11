package String1;

public class WithouEnd2 {

    public static void main(String[] args) {

        System.out.println(withouEnd2("Hello"));
        System.out.println(withouEnd2("abc"));
        System.out.println(withouEnd2("ab"));

    }


    //solution

    public static String withouEnd2(String str) {
        return str.length() < 3 ? "" : str.substring(1, str.length() - 1);

    }
}
