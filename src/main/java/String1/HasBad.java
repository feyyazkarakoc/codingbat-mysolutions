package String1;

public class HasBad {

    public static void main(String[] args) {

        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));

    }

    //solution

    public static boolean hasBad(String str) {

        if (str.length()<3){
            return false;
        } else if (str.startsWith("bad")){
            return true;
        }else {
            return str.length() >= 4 && str.startsWith("bad", 1);
        }



    }
}
