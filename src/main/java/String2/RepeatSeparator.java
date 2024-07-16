package String2;

public class RepeatSeparator {

    public static void main(String[] args) {

        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));
    }

    //solution

  /*  public static String repeatSeparator(String word, String sep, int count) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count ; i++) {
            if (count==1){
                sb.append(word);
                break;
            }
            sb.append(word).append(sep);
            if (i==count-2){
                sb.append(word);
                break;
            }
        }
        return sb.toString();

    }*/

    public static String repeatSeparator(String word, String sep, int count) {

        if (count<=0) return "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count ; i++) {
            sb.append(word);
            if (i<count-1){
                sb.append(sep);
            }
        }
        return sb.toString();
    }

}
