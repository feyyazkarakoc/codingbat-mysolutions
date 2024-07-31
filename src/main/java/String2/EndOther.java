package String2;

public class EndOther {

    public static void main(String[] args) {

        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(endOther("abc", "abXabc"));

    }

    //solution

   /* public static boolean endOther(String a, String b) {
        return a.toLowerCase().endsWith(b.toLowerCase())
                ||b.toLowerCase().endsWith(a.toLowerCase());

    }*/




   /* public static boolean endOther(String a, String b) {
        if(a.length()>=b.length()){
            return a.toLowerCase().substring(a.length()-b.length()).equals(b.toLowerCase());
        }

        return b.toLowerCase().substring(b.length()-a.length()).equals(a.toLowerCase());

    }*/


    public static boolean endOther(String a, String b) {
        return a.toLowerCase().endsWith(b.toLowerCase()) ||
                b.toLowerCase().endsWith(a.toLowerCase());
    }

}
