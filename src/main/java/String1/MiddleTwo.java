package String1;

public class MiddleTwo {

    public static void main(String[] args) {


        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));


    }

    //solution

    public static String middleTwo(String str) {

        return "" + str.charAt(str.length() / 2 - 1) + str.charAt(str.length() / 2);
    }
}
