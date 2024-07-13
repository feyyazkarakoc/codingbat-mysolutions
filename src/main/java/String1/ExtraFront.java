package String1;

public class ExtraFront {

    public static void main(String[] args) {

        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("H"));


    }


    //solution

    public static String extraFront(String str) {

        if (str.length()>1){
            return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
        }

        return str+str+str;

    }
}
