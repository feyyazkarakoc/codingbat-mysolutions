package Warmup2;

public class StringYak {

    public static void main(String[] args) {

        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));

    }


    //solution
    public static String stringYak(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 2;
                continue;
            }

            result.append(str.charAt(i));

        }

        return result.toString();

    }






   /* public static String stringYak(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {

                i += 2;
            } else {

                result.append(str.charAt(i));
            }

        }

        return result.toString();
    }*/


  /*  public static String stringYak(String str) {

        return str.replaceAll("y.k","");
    }*/
}
