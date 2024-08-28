package Logic2;

public class LoneSum {

    public static void main(String[] args) {

        System.out.println(loneSum(1,2,3));
        System.out.println(loneSum(3,2,3));
        System.out.println(loneSum(3,3,3));

    }

    public static int loneSum(int a,int b,int c){
        if (a == b && b == c) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (a == c) {
            return b;
        } else if (b == c) {
            return a;
        }
        return a + b + c;
    }


   /* public static int loneSum(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c) sum += a;
        if (b != a && b != c) sum += b;
        if (c != a && c != b) sum += c;
        return sum;
    }*/

}
