package String2;

public class RepeatFront {

    public static void main(String[] args) {


        System.out.println(repeatFront("Chocolate", 4));
        System.out.println(repeatFront("Chocolate", 3));
        System.out.println(repeatFront("Ice Cream", 2));

    }

    //solution


    public static String repeatFront(String str, int n) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str, 0, n-i);
        }
        return sb.toString();
    }
}
