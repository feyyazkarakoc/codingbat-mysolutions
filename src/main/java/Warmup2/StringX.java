package Warmup2;

public class StringX {

    public static void main(String[] args) {

        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));

    }


    //solution
    public static String stringX(String str) {

        if (str.length()<=1) return str;

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for (int i = 1; i < str.length() - 1; i++) {

            char ch = str.charAt(i);

            if (ch != 'x') {
                sb.append(ch);
            }

        }

        sb.append(str.charAt(str.length() - 1));

        return sb.toString();


    }





    /*public static String stringX(String str) {

        if (str.length() <= 1) return str;

        return str.charAt(0) + str.substring(1, str.length() - 1).replace("x", "") + str.charAt(str.length() - 1);
    }*/

}
