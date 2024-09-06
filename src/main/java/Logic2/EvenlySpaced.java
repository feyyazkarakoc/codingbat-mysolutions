package Logic2;

public class EvenlySpaced {

    public static void main(String[] args) {

        System.out.println(evenlySpaced(2, 4, 6));
        System.out.println(evenlySpaced(4, 6, 2));
        System.out.println(evenlySpaced(4, 6, 3));

    }

    public static boolean evenlySpaced(int a, int b, int c) {

        int large = Math.max(a, Math.max(b, c));
        int small = Math.min(a, Math.min(b, c));
        int medium = a + b + c - large - small;
        return (large - medium) == (medium - small);
    }


   /* public static boolean evenlySpaced(int a, int b, int c) {
        int small = Math.min(a, b);
        small = Math.min(small, c);
        int large = Math.max(a, b);
        large = Math.max(large, c);
        int medium = a + b + c - small - large;
        return (large - medium) == (medium - small);
    }*/
}
