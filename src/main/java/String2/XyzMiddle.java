package String2;

public class XyzMiddle {

    public static void main(String[] args) {

        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));


    }



    //solution


    public static boolean xyzMiddle(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                int leftLen = str.substring(0, i).length();
                int rightLen = str.substring(i + 3).length();
                if (Math.abs(leftLen - rightLen) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }


   /* public static boolean xyzMiddle(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {

                int len1 = str.substring(0, i).length();
                int len2 = str.substring(i + 3).length();
                int len3 = len1 - len2;
                if (len3 >= -1 && len3 <= 1) {
                    return true;
                }
            }
        }

        return false;
    }*/





   /* public static boolean xyzMiddle(String str) {

        for (int i = 0; i < str.length()-2 ; i++) {
            if (str.substring(i,i+3).equals("xyz")){
                int minLen = Math.abs(str.substring(0,i).length()-str.substring(i+3).length());
                if (minLen<=1){
                    return true;
                }
            }
        }
        return false;
    }*/



}
