package String3;

public class GHappy {

    public static void main(String[] args) {

        System.out.println(gHappy("xxggxx"));
        System.out.println(gHappy("xxgxx"));
        System.out.println(gHappy("xxggyygxx"));

    }

    //solutions


    public static boolean  gHappy(String str) {

        boolean isHappy = false;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'g') {
                isHappy = i + 1 < str.length() && str.charAt(i + 1) == 'g';
            }

        }

        return isHappy;

    }
}
