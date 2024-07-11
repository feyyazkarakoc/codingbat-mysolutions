package String1;

public class ComboString {


    public static void main(String[] args) {


        System.out.println(comboString("Hello", "hi"));
        System.out.println(comboString("hi", "Hello"));
        System.out.println(comboString("aaa", "b"));

    }


    //solution

    public static String comboString(String a, String b) {

        return a.length() > b.length() ? b + a + b : a + b + a;

    }
}
