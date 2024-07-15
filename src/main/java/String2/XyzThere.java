package String2;

public class XyzThere {

    public static void main(String[] args) {

        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
    }


    //solution

    public static boolean xyzThere(String str) {

        if (str.contains(".xyz")){
            str=str.replace(".xyz","");
        }
        return str.contains("xyz");

    }
}
