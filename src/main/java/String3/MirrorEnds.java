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

        for (int i = 0; i <= len / 2; i++) {

            if (string.charAt(0)==string.charAt(string.length()-1)){

            }

            String prefix = string.substring(0, i);
            String suffix = string.substring(len - i);

            for (int j = suffix.length()-1; j >=0 ; j--) {

                suffix+=""+suffix.charAt(j);

            }

            if (prefix.equals(suffix)) {
                sb = new StringBuilder(prefix);

            }
        }
        return sb.toString();
    }
}
