package Warmup2;

public class AltPairs {

    public static void main(String[] args) {

        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));

    }


    //solution
    public static String altPairs(String str) {

        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < str.length()) {

            result.append(str.charAt(i));
            i++;

            if (i < str.length()) {
                result.append(str.charAt(i));
                i += 3;
            }


        }

        return result.toString();

    }


      /* public static String altPairs(String str) {

           StringBuilder result = new StringBuilder();

           for (int i = 0; i < str.length(); i += 3) {

               result.append(str.charAt(i));
               i++;

               if (i < str.length()) {
                   result.append(str.charAt(i));
               }

           }

           return result.toString();

       }*/

}
