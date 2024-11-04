package String3;

public class SumNumbers {

    public static void main(String[] args) {

        System.out.println(sumDigits("abc123xyz"));
        System.out.println(sumDigits("aa11b33"));
        System.out.println(sumDigits("7 11"));

    }


    //solutions


    public static int sumDigits(String str) {

        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {

                sb.append(ch);

            } else if (sb.length() > 0) {

                sum += Integer.parseInt(sb.toString());
                sb = new StringBuilder();
            }

        }

        if (sb.length() > 0) {

            sum += Integer.parseInt(sb.toString());
        }

        return sum;
    }





  /*  public static int sumDigits(String str) {


        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {

                while (i < str.length() && Character.isDigit(str.charAt(i))) {

                    sb.append(str.charAt(i));
                    i++;
                }

                sum += Integer.parseInt(sb.toString());
                sb = new StringBuilder();
                i--;

            }
        }

        return sum;
    }*/




   /* public static int sumDigits(String str) {

        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {

                while (i < str.length() && Character.isDigit(str.charAt(i))) {

                    sb.append(str.charAt(i));
                    i++;
                }

                sum += Integer.parseInt(sb.toString());
                sb = new StringBuilder();
                i--;
            }

        }

        return sum;

    }*/
}
