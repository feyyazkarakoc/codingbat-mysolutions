package String2;

public class BobThere {

    public static void main(String[] args) {

        System.out.println(bobThere("abcbob"));
        System.out.println(bobThere("b9b"));
        System.out.println(bobThere("bac"));

    }


    //solution

    public static boolean bobThere(String str) {
        boolean containsBob=false;
        for (int i = 0; i < str.length()-2 ; i++) {
            if (str.charAt(i)=='b' && str.charAt(i+2)=='b'){
               containsBob = true;
                break;
            }
        }

        return containsBob;

    }

}
