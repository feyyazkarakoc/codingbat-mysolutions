package String1;

public class TwoChar {

    public static void main(String[] args) {

        System.out.println(twoChar("java", 0));
        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 3));

    }


    //solutions

    public static String twoChar(String str, int index) {

        if (index<0 || str.length()< index+2){
            return str.substring(0,2);
        } else {
            return str.substring(index,index+2);
        }


    }
}
