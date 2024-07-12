package String1;

public class LastChars {

    public static void main(String[] args) {

        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));

    }


    //solution

    public static String lastChars(String a, String b) {

        if (a.isEmpty()){
            a="@";
        }

        if (b.isEmpty()){
            b="@";
        }

        return ""+a.charAt(0)+b.charAt(b.length()-1);
    }

}
