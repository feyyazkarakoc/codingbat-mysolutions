package String2;

public class MixString {

    public static void main(String[] args) {

        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }


    //solution

  /*  public static String mixString(String a, String b) {

        StringBuilder sb = new StringBuilder();

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                sb.append(a.charAt(i)).append(b.charAt(i));
            }
        }

        if (a.length() > b.length()) {
            for (int i = 0; i < b.length(); i++) {
                sb.append(a.charAt(i)).append(b.charAt(i));
            }
            sb.append(a.substring(b.length()));
        }

        if (a.length() < b.length()) {
            for (int i = 0; i < a.length(); i++) {
                sb.append(a.charAt(i)).append(b.charAt(i));
            }
            sb.append(b.substring(a.length()));
        }

        return sb.toString();
    }*/




    public static String mixString(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int minLen = Math.min(a.length(),b.length());
        for (int i = 0; i < minLen ; i++) {
            sb.append(a.charAt(i)).append(b.charAt(i));
        }
        sb.append(a.substring(minLen)).append(b.substring(minLen));
        return sb.toString();
    }

}
