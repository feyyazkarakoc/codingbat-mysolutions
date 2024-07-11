package String1;

public class ExtraEnd {

    public static void main(String[] args) {

        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));
    }


    //solution

    public static String extraEnd(String str) {
        String substring = str.substring(str.length() - 2);
        return substring + substring + substring;
    }
}
