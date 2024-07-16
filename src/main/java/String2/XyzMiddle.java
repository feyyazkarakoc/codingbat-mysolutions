package String2;

public class XyzMiddle {

    public static void main(String[] args) {

        System.out.println(xyzMiddle("xyzAxyzBBB"));
        System.out.println(xyzMiddle("xyzxyzAxyzBxyzxyz"));
        System.out.println(xyzMiddle("AxyzBBB"));


    }


    //solution

    public static boolean xyzMiddle(String str) {

        for (int i = 0; i < str.length()-2 ; i++) {
            if (str.substring(i,i+3).equals("xyz")){
                int minLen = Math.abs(str.substring(0,i).length()-str.substring(i+3).length());
                if (minLen<=1){
                    return true;
                }
            }
        }
        return false;
    }
}
