package String2;

public class OneTwo {

    public static void main(String[] args) {

        System.out.println(oneTwo("abc"));
        System.out.println(oneTwo("tca"));
        System.out.println(oneTwo("tcagdo"));


    }




    //solution

    public static String oneTwo(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 2; i += 3) {
            sb.append(str.substring(i + 1, i + 3)).append(str.substring(i, i + 1));
        }
        return sb.toString();
    }




  /*  public static String oneTwo(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length() - 2; i += 3) {
            String str2 = str.substring(i, i + 3);
            String str3 = str2.substring(1, 3) + str2.substring(0, 1);
            sb.append(str3);
        }

        return sb.toString();
    }*/










  /*  public static String oneTwo(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length()-2 ; i+=3) {
            String str1 = str.substring(i,i+3);
            String str2 = str1.substring(1,3)+str1.substring(0,1);
            sb.append(str2);
        }
        return sb.toString();
    }*/

   /* public static String oneTwo(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length()-2 ; i+=3) {
            String str1 = str.substring(i,i+3);
            String str2 = str1.substring(1,3)+str1.substring(0,1);
            sb.append(str2);
        }
        return sb.toString();
    }*/



}
