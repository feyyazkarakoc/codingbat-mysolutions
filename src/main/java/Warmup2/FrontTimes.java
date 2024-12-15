package Warmup2;

public class FrontTimes {

    public static void main(String[] args) {

        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));

    }




    //solution
    public static String frontTimes(String str, int n) {

        StringBuilder sb = new StringBuilder();

        if (str.length()>=3){
            for (int i = 0; i < n; i++) {
                sb.append(str.substring(0,3));

            }
        }else {

            for (int i = 0; i < n; i++) {
                sb.append(str);

            }

        }

        return sb.toString();
    }


}
