package Warmup1;

public class PosNeg {


    public static void main(String[] args) {

        System.out.println(posNeg(1, -1, false));
        System.out.println(posNeg(-1, 1, false));
        System.out.println(posNeg(-4, -5, true));
    }


    // solution :
    public static boolean posNeg(int a, int b, boolean negative) {
        return (a < 0 && b > 0 && !negative)
                || (a > 0 && b < 0 && !negative)
                || (a < 0 && b < 0 && negative);
    }
}
