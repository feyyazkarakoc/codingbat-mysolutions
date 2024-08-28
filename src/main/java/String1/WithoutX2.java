package String1;

public class WithoutX2 {

    public static void main(String[] args) {

        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));

    }


    //solution
    public static String withoutX2(String str) {
        if (str.startsWith("xx")) {
            str = str.substring(2);
        } else if (str.startsWith("x")) {
            str = str.substring(1);
        } else if (str.length() > 0 && str.charAt(1) == 'x') {
            str = str.substring(0, 1) + str.substring(2);
        }
        return str;
    }
}
