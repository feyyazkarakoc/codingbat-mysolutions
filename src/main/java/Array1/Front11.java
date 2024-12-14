package Array1;

import java.util.Arrays;

public class Front11 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(front11(new int[]{1, 2, 3}, new int[]{7, 9, 8})));
        System.out.println(Arrays.toString(front11(new int[]{1}, new int[]{2})));
        System.out.println(Arrays.toString(front11(new int[]{1, 7}, new int[]{})));

    }


    //solution
    public static int[] front11(int[] a, int[] b) {

        return a.length >= 1 && b.length >= 1
                ? new int[]{a[0], b[0]}
                : (a.length >= 1
                ? new int[]{a[0]}
                : (b.length >= 1
                ? new int[]{b[0]}
                : new int[]{}));

    }


   /* public static int[] front11(int[] a, int[] b) {

        if (a.length == 0 && b.length == 0) {
            return new int[]{};
        }

        if (a.length == 0) {
            return new int[]{b[0]};
        }

        if (b.length == 0) {
            return new int[]{a[0]};
        }

        return new int[]{a[0], b[0]};
    }*/


}
