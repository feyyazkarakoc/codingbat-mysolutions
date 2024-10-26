package String3;

public class MirrorEnds {

    public static void main(String[] args) {

        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));
        System.out.println(mirrorEnds("aba"));

    }


    //solution

    public static String mirrorEnds(String string) {

        StringBuilder sb = new StringBuilder();
        int len = string.length();

        for (int i = 0; i < len; i++) {

            if (string.charAt(i) == string.charAt(len - 1 - i)) {
                sb.append(string.charAt(i));
            } else break;

        }

        return sb.toString();
    }




   /* public static String mirrorEnds(String string) {

        StringBuilder sb = new StringBuilder();
        int len = string.length();

        for (int i = 0; i < len; i++) {

            if (string.charAt(i) == string.charAt(len - 1 - i)) {
                sb.append(string.charAt(i));
            }
        }

        return sb.toString();
    }*/
}
