package String2;

public class SameStarChar {

    public static void main(String[] args) {

        System.out.println(sameStarChar("xy*yzz"));
        System.out.println(sameStarChar("xy*zzz"));
        System.out.println(sameStarChar("*xa*az"));


    }


    //solution

   /* public static boolean sameStarChar(String str) {

        boolean isSameChar = false;
        for (int i = 1; i < str.length() - 1; i++) {

            if (str.charAt(i) == '*') {
                isSameChar = str.charAt(i - 1) == str.charAt(i + 1);
            }
        }

        if (!str.contains("*") || str.replace("*", "").isEmpty()) {
            isSameChar = true;
        }

        return isSameChar;

    }*/


    public static boolean sameStarChar(String str) {

        for (int i = 1; i < str.length()-1; i++) {
            if (str.charAt(i)=='*'){
                if (str.charAt(i-1)!=str.charAt(i+1)){
                    return false;
                }
            }
        }
        return true;
    }

}


