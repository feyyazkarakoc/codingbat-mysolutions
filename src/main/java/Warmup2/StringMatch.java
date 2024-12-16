package Warmup2;

public class StringMatch {

    public static void main(String[] args) {

        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));

    }


    //solution
    public static int stringMatch(String a, String b) {

        int count = 0;

        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {

            if (i + 2 <= len && a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }

        }

        return count;

    }


    /*public static int stringMatch(String a, String b) {

        int count = 0;

        for (int i = 0; i < Math.min(a.length(), b.length()) - 1; i++) {

            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) count++;

        }

        return count;
    }*/
}
