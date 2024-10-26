package String3;

public class MaxBlock {

    public static void main(String[] args) {

        System.out.println(maxBlock("hoopla"));
        System.out.println(maxBlock("abbCCCddBBBxx"));
        System.out.println(maxBlock(""));

    }


    //solution

    public static int maxBlock(String str) {
        int len = str.length();
        int maxLen = 0;
        int currentlen = 1;

        for (int i = 0; i < len; i++) {

            if (i + 1 < len && str.charAt(i) == str.charAt(i + 1)) {
                currentlen++;
            } else {

                if (currentlen > maxLen) {
                    maxLen = currentlen;
                }

                currentlen = 1;
            }

        }

        return maxLen;
    }








   /* public static int maxBlock(String str) {

        StringBuilder sb = new StringBuilder();
        int len = str.length();
        int count = 0;

        for (int i = 0; i < len; i++) {

            if (i + 1 < len && str.charAt(i) == str.charAt(i + 1)) {
                sb.append(str.charAt(i));
            } else {
                sb.append(str.charAt(i));
                if (sb.length() > count) {
                    count = sb.length();
                }
                sb = new StringBuilder();

            }
        }

        return count;
    }*/


  /* public static int maxBlock(String str) {

        StringBuilder sb = new StringBuilder();
        int len = str.length();
        int count = 0;

        for (int i = 0; i < len; i++) {

            if (i + 1 < len && str.charAt(i) == str.charAt(i + 1)) {
                sb.append(str.charAt(i));
            } else {
                sb.append(str.charAt(i));
                if (sb.length() > count) {
                    count = sb.length();
                }
                sb = new StringBuilder();
            }

        }

        return count;
    }*/


   /* public static int maxBlock(String str) {

        int len = str.length();
        int maxLen = 0;
        int currentLen = 1;

        for (int i = 0; i < len; i++) {

            if (i + 1 < len && str.charAt(i) == str.charAt(i + 1)) {
               currentLen++;
            } else {

                if (currentLen > maxLen) {
                    maxLen = currentLen;
                }

                currentLen=1;

            }
        }

        return maxLen;
    }*/




}
