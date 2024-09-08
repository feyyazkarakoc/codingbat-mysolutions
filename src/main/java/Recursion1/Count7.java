package Recursion1;

public class Count7 {

    public static void main(String[] args) {

        System.out.println(count7(717));
        System.out.println(count7(7));
        System.out.println(count7(123));
    }


    //solution

    public static int count7(int n) {
        if (n == 0) return 0;
        return (n % 10 == 7 ? 1 : 0) + count7(n / 10);

    }




   /* public static int count7(int n) {
        int count = 0;
        if (n == 0) return 0;
        if (n % 10 == 7) {
            count++;
        }
        return count + count7(n / 10);
    }*/
}
