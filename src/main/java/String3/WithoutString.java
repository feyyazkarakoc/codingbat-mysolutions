package String3;

public class WithoutString {

    public static void main(String[] args) {

        System.out.println(withoutString("Hello there", "llo"));
        System.out.println(withoutString("Hello there", "e"));
        System.out.println(withoutString("Hello there", "x"));

    }

    //solutions


    public static String withoutString(String base, String remove) {

        StringBuilder sb = new StringBuilder();

        int len = remove.length();

        String lowerBase = base.toLowerCase();

        String lowerRemove = remove.toLowerCase();

        for (int i = 0; i < base.length(); i++) {

            if (i + len <= base.length() && lowerBase.substring(i, i + len).equals(lowerRemove)) {
                i = i + len - 1;
            } else {
                sb.append(base.charAt(i));
            }

        }

        return sb.toString();

    }







    /* public static String withoutString(String base, String remove) {


        StringBuilder sb = new StringBuilder();

        int len = remove.length();

        String lowerBase = base.toLowerCase();

        String lowerRemove = remove.toLowerCase();

        for (int i = 0; i < base.length(); i++) {

            if (i + len <= base.length() && lowerBase.substring(i, i + len).equals(lowerRemove)) {
                i = i + len - 1;
            } else {
                sb.append(base.charAt(i));
            }

        }

        return sb.toString();

    }*/

}
