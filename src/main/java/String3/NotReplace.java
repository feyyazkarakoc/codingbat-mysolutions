package String3;

public class NotReplace {

    public static void main(String[] args) {

        System.out.println(notReplace("is test"));
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));
    }


    //solutions


    public static String notReplace(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (str.equals("is")) {

                sb.append("is not");
                i++;

            } else if (i == 0 && i + 2 < str.length() && str.startsWith("is") && !Character.isLetter(str.charAt(i + 2))) {

                sb.append("is not");
                i++;

            } else if (i > 0 && i + 2 < str.length() && str.substring(i, i + 2).equals("is") && !Character.isLetter(str.charAt(i - 1)) && !Character.isLetter(str.charAt(i + 2))) {

                sb.append("is not");
                i++;

            } else if (i > 0 && i == str.length() - 2 && str.substring(i, i + 2).equals("is") && !Character.isLetter(str.charAt(i - 1))) {

                sb.append("is not");
                i++;

            } else {

                sb.append(str.charAt(i));
            }

        }

        return sb.toString();


    }
}
