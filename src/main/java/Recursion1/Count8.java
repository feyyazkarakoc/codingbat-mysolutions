package Recursion1;

public class Count8 {

    public static void main(String[] args) {

        System.out.println(count8(8));
        System.out.println(count8(818));
        System.out.println(count8(8818));
    }


    //solution

    public static int count8(int n) {
        if (n == 0) return 0;
        return (n % 10 == 8 ? (n % 100 == 88 ? 2 : 1) : 0) + count8(n / 10);

    }


   /* public static int count8(int n) {
        if (n == 0) return 0;
        int rightDigit = n % 10;
        int nextDigit = (n / 10) % 10;
        if (rightDigit == 8) {
            if (nextDigit == 8) {
                return 2 + count8(n / 10);
            } else {
                return 1 + count8(n / 10);
            }
        } else {
            return count8(n / 10);
        }
    }*/
}
