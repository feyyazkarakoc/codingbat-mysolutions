package String2;

public class XyBalance {

    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));

    }

    //solution



    public static boolean xyBalance(String str) {

        return str.lastIndexOf("y")>str.lastIndexOf("x")||!str.contains("x");

    }





   /* public static boolean xyBalance(String str) {

        if (str.lastIndexOf("y") > str.lastIndexOf("x")) {
            return true;
        } else if (str.contains("x") && !str.contains("y")) {
            return false;
        } else {
            return !(str.contains("x") && str.contains("y"));
        }


    }*/

}
