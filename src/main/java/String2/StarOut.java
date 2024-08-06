package String2;

public class StarOut {

    public static void main(String[] args) {

        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("sm*eilly"));

    }


    //solution

    public static String starOut(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' || (i > 0 && str.charAt(i - 1) == '*') || (i < str.length() - 1 && str.charAt(i + 1) == '*')) {
                continue;
            } else {
                sb.append(str.charAt(i));

            }
        }
        return sb.toString();
    }








   /* public static String starOut(String str) {
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        for (int i = 0; i < len ; i++) {
            if (str.charAt(i)=='*' || (i>0 && str.charAt(i-1)=='*') || (i<len-1 && str.charAt(i+1)=='*')){
                continue;
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }*/




    /* public static String starOut(String str) {
        StringBuilder sb = new StringBuilder();
        int len = str.length();

        for (int i = 0; i < len; i++) {

            if (str.charAt(i) == '*' || (i > 0 && str.charAt(i - 1) == '*') || (i < len - 1 && str.charAt(i + 1) == '*')) {
                continue;
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }*/

}
