package Recursion1;

public class NoX {

    public static void main(String[] args) {

        System.out.println(noX("xaxb"));
        System.out.println(noX("abc"));
        System.out.println(noX("xx"));
    }


    //solution

    public static String noX(String str) {
      if (str.length()==0) return "";
      return (str.startsWith("x") ? "" : str.charAt(0)) + noX(str.substring(1));

    }
}
