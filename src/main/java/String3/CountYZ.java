package String3;

public class CountYZ {

    public static void main(String[] args) {

        System.out.println(countYZ("fez day"));
        System.out.println(countYZ("day fez"));
        System.out.println(countYZ("day fyyyz"));

    }

    //solutions


    public static int countYZ(String str) {

        int count = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z') &&
                    (i + 1 == str.length() || !Character.isLetter(str.charAt(i + 1)))) {
                count++;
            }

        }
        return count;

    }



   /* public static int countYZ(String str) {

        int count = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z') &&
                (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1)))) {
                count++;
            }
        }

        return count++;
    }*/

}
