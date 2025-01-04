package Warmup1;

public class SumDouble {

    public static void main(String[] args) {

        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));
    }


    public static int sumDouble(int a, int b) {
        return a == b ? (a + b) * 2 : a + b;
    }
}
