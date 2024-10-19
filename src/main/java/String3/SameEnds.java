package String3;

public class SameEnds {

    public static void main(String[] args) {

        System.out.println(sameEnds("abXYab"));
        System.out.println(sameEnds("xx"));
        System.out.println(sameEnds("xxx"));

    }


    //solution

    public static String sameEnds(String string) {

        StringBuilder sb = new StringBuilder();
        int len = string.length();

        for (int i = 1; i <= len / 2; i++) {

            String prefix = string.substring(0, i);
            String suffix = string.substring(len - i);

            if (prefix.equals(suffix)) {
                sb = new StringBuilder("");
                sb.append(prefix);
            }

        }
        return sb.toString();
    }
}
