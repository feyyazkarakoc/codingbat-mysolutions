package String2;

public class RepeatEnd {

    public static void main(String[] args) {

        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));

    }

    //solution

    public static String repeatEnd(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n ; i++) {
          sb.append(str.substring(str.length()-n));
        }
        return sb.toString();
    }



   /* public static String repeatEnd(String str, int n) {

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(str.substring(str.length()-n));
        }
        return sb.toString();
    }*/

}
