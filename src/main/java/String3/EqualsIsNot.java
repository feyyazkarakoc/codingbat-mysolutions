package String3;

public class EqualsIsNot {

    public static void main(String[] args) {

        System.out.println(equalIsNot("This is not"));
        System.out.println(equalIsNot("This is notnot"));
        System.out.println(equalIsNot("noisxxnotyynotxisi"));

    }

    //solutions


    public static boolean equalIsNot(String str) {

        int countIs = 0;
        int countNot = 0;

        for (int i = 0; i <= str.length()-2; i++) {
            if (str.substring(i, i + 2).equals("is")) {
                countIs++;
                i++;
            }
        }

        for (int i = 0; i <= str.length()-3; i++) {
            if (str.substring(i, i + 3).equals("not")) {
                countNot++;
                i += 2;
            }
        }

        return countIs == countNot;

    }
}
