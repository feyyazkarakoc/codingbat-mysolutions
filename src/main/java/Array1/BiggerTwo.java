package Array1;

import java.util.Arrays;

public class BiggerTwo {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(biggerTwo(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println(Arrays.toString(biggerTwo(new int[]{3, 4}, new int[]{1, 2})));
        System.out.println(Arrays.toString(biggerTwo(new int[]{1, 1}, new int[]{1, 2})));

    }


    //solution
    public static int[] biggerTwo(int[] a, int[] b) {

        return (a[0] + a[1]) >= (b[0] + b[1]) ? a : b;

    }
}
