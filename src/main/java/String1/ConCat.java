package String1;

public class ConCat {

    public static void main(String[] args) {

        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));

    }


    //solution

    public static String conCat(String a, String b) {

        if (!a.isEmpty() && !b.isEmpty() && a.endsWith(b.substring(0,1))){
            return a+b.substring(1);
        }else {
            return a+b;
        }
    }

}
