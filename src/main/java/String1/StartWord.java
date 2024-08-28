package String1;

public class StartWord {

    public static void main(String[] args) {

        System.out.println(startWord("hippo", "hi"));
        System.out.println(startWord("hippo", "xip"));
        System.out.println(startWord("hippo", "i"));

    }


    //solution
    public static String startWord(String str, String word) {
        if (str.length() > 0) {
            if (str.startsWith(word)) {
                return word;
            } else if (str.substring(1).startsWith(word.substring(1))) {
                return str.substring(0, 1) + word.substring(1);
            }

        }

        return "";
    }



   /* public static String startWord(String str,String word) {
        if (str.length() >= word.length()) {
            if (str.startsWith(word)) {
                return word;
            } else if (str.substring(1).startsWith(word.substring(1))) {
                return str.charAt(0) + word.substring(1);
            }
        }

        return "";
    }*/
}
