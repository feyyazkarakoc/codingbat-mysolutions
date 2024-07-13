package String1;

public class MinCat {

    public static void main(String[] args) {

        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));

    }

    //solution

    public static String minCat(String a, String b) {

        if (a.length()==b.length()){
            return a+b;
        } else if (a.length()>b.length()) {
            return a.substring(a.length()-b.length())+b;

        } else {
            return a + b.substring(b.length() - a.length());
        }

    }
}
