package String3;

public class SumDigits {

    public static void main(String[] args) {

        System.out.println(sumDigits("aa1bc2d3"));
        System.out.println(sumDigits("aa11b33"));
        System.out.println(sumDigits("Chocolate"));

    }



    //solutions

    public static int sumDigits(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {

                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
                //sum += Integer.parseInt("" + str.charAt(i));
                //sum += Integer.valueOf("" + str.charAt(i));


            }

        }

        return sum;
    }
}
