package String3;

public class SameEnds {

    public static void main(String[] args) {

        System.out.println( sameEnds("abXYab"));
        System.out.println( sameEnds("xx"));
        System.out.println( sameEnds("xxx"));

    }



    //solutions

    public static String sameEnds(String str) {

        StringBuilder sb = new StringBuilder();
        if (!str.isEmpty()){

            for (int i = 0; i < str.length()-1 ; i++) {

                if (str.charAt(i)==str.charAt(str.length()-1-i)){
                    sb.append(str.charAt(i));

                    if (str.charAt(i+1)!=str.charAt(str.length()-2-i)){
                        break;
                    }
                }

            }

        }

        return sb.toString();


    }
}
