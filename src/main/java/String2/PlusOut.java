package String2;

public class PlusOut {

    public static void main(String[] args) {


        System.out.println(plusOut("12xy34", "xy"));
        System.out.println(plusOut("12xy34", "1"));
        System.out.println(plusOut("12xy34xyabcxy", "xy"));

    }


    //solution

    public static String plusOut(String str, String word) {
        StringBuilder sb = new StringBuilder();
        int len = word.length();
        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - len && str.substring(i, i + len).equals(word)) {
                sb.append(word);
                i += len - 1;

            } else {
                sb.append("+");
            }
        }
        return sb.toString();
    }




  /*  public static String plusOut(String str, String word) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i<str.length()) {
            if (i<=str.length()-word.length() && str.substring(i,i+word.length()).equals(word)){
                sb.append(word);
                i+=word.length();
            }else {
                sb.append("+");
                i++;
            }
        }
        return sb.toString();
    }*/




   /* public static String plusOut(String str, String word) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i<str.length()){
            if (i<=str.length()-word.length() && str.substring(i,i+word.length()).equals(word)){
                sb.append(word);
                i+=word.length();
            }else {
                sb.append("+");
                i++;
            }
        }
        return sb.toString();
    }*/






  /*  public static String plusOut(String str, String word) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i<str.length()){
            if (i<=str.length()-word.length() && str.substring(i,i+word.length()).equals(word)){
                sb.append(word);
                i+=word.length();
            }else{
                sb.append("+");
                i++;
            }
        }
        return sb.toString();
    }*/
}
