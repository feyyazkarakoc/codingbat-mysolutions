package String2;

public class GetSandwich {

    public static void main(String[] args) {

        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));


    }


    //solution


    public static String getSandwich(String str) {
        if (str.indexOf("bread") != str.lastIndexOf("bread")) {
            return str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
        }
        return "";

    }

   /* public static String getSandwich(String str) {
        if (str.indexOf("bread")!=str.lastIndexOf("bread")){
            for (int i = 0; i < str.length() ; i++) {
                if (str.substring(i,i+5).equals("bread")){
                    return str.substring(i+5,str.lastIndexOf("bread"));
                }
            }
        }
        return "";
    }*/

}
