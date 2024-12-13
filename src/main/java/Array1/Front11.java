package Array1;

import java.util.Arrays;

public class Front11 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(front11(new int[]{1, 3, 4, 5}, new int[]{1, 3, 4, 5})));
        System.out.println(Arrays.toString(front11(new int[]{2, 1, 3, 4, 5}, new int[]{1, 3, 4, 5})));
        System.out.println(Arrays.toString(front11(new int[]{1, 1, 1}, new int[]{1, 3, 4, 5})));

    }


    //solution
    public static int[] front11(int[] a, int[] b) {

        return a.length >= 2
                ? new int[]{a[0], a[1]}
                : (a.length == 1
                ? new int[]{a[0], b[0]}
                : new int[]{b[0], b[1]});

    }
}
