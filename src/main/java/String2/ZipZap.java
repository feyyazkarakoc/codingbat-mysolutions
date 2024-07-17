package String2;

public class ZipZap {

    public static void main(String[] args) {

        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));


    }




    //solution-1


   public static String zipZap(String str) {
        return str.replaceAll("z.p","zp");
   }


    //solution-2

  /*  public static String zipZap(String str) {

        StringBuilder sb = new StringBuilder();
        int len = str.length();

        for (int i = 0; i < len ; i++) {

            if (i<len-2 && str.charAt(i)=='z' && str.charAt(i+2)=='p'){
                sb.append("zp");
                i+=2;
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }*/







  /*  public static String zipZap(String str) {
        return str.replaceAll("z.p","zp");
    }*/

   /* public static String zipZap(String str) {
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        for (int i = 0; i < str.length() ; i++) {
            if (i<len-2 && str.charAt(i)=='z' && str.charAt(i+2)=='p'){
                sb.append("zp");
                i+=2;
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }*/

}
