package String3;

public class SameEnds {

    public static void main(String[] args) {

        System.out.println( sameEnds("abXYab"));
        System.out.println( sameEnds("xx"));
        System.out.println( sameEnds("xxx"));

    }



    //solutions

    public static String sameEnds(String string) {

        StringBuilder sb = new StringBuilder();
        if (!string.isEmpty()) {

            for (int i = 0; i < string.length()/2; i++) {

                if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
                    sb.append(string.charAt(i));

                    if (string.charAt(i + 1) != string.charAt(string.length() - 2 - i)) {
                        break;
                    }
                }

            }

        }

        return sb.toString();


    }
}
