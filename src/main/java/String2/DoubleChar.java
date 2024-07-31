package String2;

public class DoubleChar {

    public static void main(String[] args) {


        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));


    }



    //solutions

   public static String doubleChar(String str) {

        StringBuilder sb= new StringBuilder();
        for (String s : str.split("")){
            sb.append(s).append(s);
        }
        return sb.toString();
    }



   /* public static String doubleChar(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            sb.append(str.charAt(i)).append(str.charAt(i));
        }
        return sb.toString();
    }*/


   /* public static String doubleChar(String str) {
        StringBuilder sb = new StringBuilder();
        for (String s : str.split("")){
            sb.append(s).append(s);
        }
        return sb.toString();
    }*/




}
