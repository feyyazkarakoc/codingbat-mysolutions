package String2;

public class ZipZap {

    public static void main(String[] args) {

        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));


    }

    //solution

    public static String zipZap(String str) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length()-2 ; i++) {
            sb.append(str.charAt(i));
            if (str.charAt(i)=='z'&&str.charAt(i+2)=='p'){
                i++;
            }

        }
        return sb.toString()+str.charAt(str.length()-1);

    }
}
