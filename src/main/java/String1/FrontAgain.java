package String1;

public class FrontAgain {

    public static void main(String[] args) {

        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));

    }

    //solution

    public static boolean frontAgain(String str) {

        return str.length() > 1 && str.endsWith(str.substring(0, 2));
    }

}
