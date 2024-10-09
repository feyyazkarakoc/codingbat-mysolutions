package String3;

public class CountTriple {

    public static void main(String[] args) {

        System.out.println(countTriple("abcXXXabc"));
        System.out.println(countTriple("xxxabyyyycd"));
        System.out.println(countTriple("a"));

    }



    //solutions

    public static int countTriple(String str) {

        int count = 0;

        if (str.length() >= 3) {

            for (int i = 1; i < str.length() - 1; i++) {

                if (str.charAt(i) == str.charAt(i - 1) && str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                }
            }
        }
        return count;
    }




    /*public static int countTriple(String str) {

        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {

            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                count++;
            }

        }

        return count;
    }*/
}
