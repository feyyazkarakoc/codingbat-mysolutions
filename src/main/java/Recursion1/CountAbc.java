package Recursion1;

public class CountAbc {

    public static void main(String[] args) {


        System.out.println(countAbc("abc"));
        System.out.println(countAbc("abcxxabc"));
        System.out.println(countAbc("abaxxaba"));
    }


    //solution

    public static int countAbc(String str) {
        if (str.length() < 3) return 0;
        return (str.startsWith("abc") || str.startsWith("aba") ? 1 : 0) + countAbc(str.substring(1));


    }
}
