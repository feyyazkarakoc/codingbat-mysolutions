package String1;

public class Left2 {

    public static void main(String[] args) {


        System.out.println(left2("Hello"));
        System.out.println(left2("java"));
        System.out.println(left2("Hi"));

    }


    //solution

    public static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);

    }
}
