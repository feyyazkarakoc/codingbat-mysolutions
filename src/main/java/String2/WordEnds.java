package String2;

public class WordEnds {

    public static void main(String[] args) {


        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));

    }


    public static String wordEnds(String str, String word) {
        StringBuilder sb = new StringBuilder();
        int wordLength = word.length();
        for (int i = 0; i <= str.length()-wordLength ; i++) {
            if (str.substring(i,i+wordLength).equals(word)){
                if (i>0){
                    sb.append(str.charAt(i-1));
                }
                if (i+wordLength<str.length()){
                    sb.append(str.charAt(i+wordLength));
                }
            }
        }

        return sb.toString();

    }




   /* public static String wordEnds(String str, String word) {
        StringBuilder sb = new StringBuilder();
        int wordLen = word.length();
        for (int i = 0; i <= str.length()-wordLen ; i++) {
            if (str.substring(i,i+wordLen).equals(word)){
                if (i>0){
                    sb.append(str.charAt(i-1));
                }
                if (i+wordLen<str.length()){
                    sb.append(str.charAt(i+wordLen));
                }
            }
        }
        return sb.toString();
    }*/





   /* public static String wordEnds(String str, String word) {
        StringBuilder sb = new StringBuilder();
        int wordLen = word.length();
        for (int i = 0; i <= str.length()-wordLen ; i++) {
            if (str.substring(i,i+wordLen).equals(word)){
                if (i>0){
                    sb.append(str.charAt(i-1));
                }
                if (i+wordLen<str.length()){
                    sb.append(str.charAt(i+wordLen));
                }
            }

        }
        return sb.toString();
    }*/

}
