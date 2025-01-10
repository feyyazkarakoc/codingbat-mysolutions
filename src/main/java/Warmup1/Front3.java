package Warmup1;

public class Front3 {

    public static void main(String[] args) {

        System.out.println(front3("Java"));
        System.out.println(front3("Chocolate"));
        System.out.println(front3("abc"));
    }


    // solution :
    public static String front3(String str) {

        String front = str.length() < 3 ? str : str.substring(0, 3);
        return front + front + front;


    }




    /*public static String front3(String str) {

        String front = str.length() < 3 ? str : str.substring(0, 3);
        return front + front + front;
    }*/



}
