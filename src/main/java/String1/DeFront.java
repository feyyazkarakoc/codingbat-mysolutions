package String1;

public class DeFront {


    public static void main(String[] args) {

        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));

    }



    //solution
    public static String deFront(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.length() > 0 && str.charAt(0) == 'a') {
            sb.append("a");
        }
        if (str.length() > 1 && str.charAt(1) == 'b') {
            sb.append("b");
        }
        if (str.length() > 2) {
            sb.append(str.substring(2));
        }

        return sb.toString();
    }



   /* public static String deFront(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.length() > 0 && str.charAt(0) == 'a') {
            sb.append("a");
        }
        if (str.length() > 1 && str.charAt(1) == 'b') {
            sb.append("b");
        }
        if (str.length() > 2) {
            sb.append(str.substring(2));
        }
        return sb.toString();
    }*/
}
