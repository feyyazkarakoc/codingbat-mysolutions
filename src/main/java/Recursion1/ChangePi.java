package Recursion1;

public class ChangePi {

    public static void main(String[] args) {

        System.out.println(changePi("xpix"));
        System.out.println(changePi("pipi"));
        System.out.println(changePi("pip"));
    }


    //solution

    public static String changePi(String str) {
        if (str.length() < 2) return str;
        if (str.startsWith("pi")) {
            return "3.14" + changePi(str.substring(2));
        } else {
            return str.charAt(0) + changePi(str.substring(1));
        }

    }
}
