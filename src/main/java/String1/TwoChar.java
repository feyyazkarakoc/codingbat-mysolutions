package String1;

public class TwoChar {

    public static void main(String[] args) {

        System.out.println(twoChar("java", 0));
        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 3));

    }


    //solutions

    public static String twoChar(String str, int index) {


        return "";//(index == 2) ? str.substring(2, 4) : str.substring(0, 2);
    }
}
