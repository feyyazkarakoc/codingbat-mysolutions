package Array1;

import java.util.Arrays;

public class PlusTwo {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(plusTwo(new int[]{1, 2}, new int[]{3,4})));
        System.out.println(Arrays.toString(plusTwo(new int[]{4,4}, new int[]{2,2})));
        System.out.println(Arrays.toString(plusTwo(new int[]{9,2}, new int[]{3,4})));

    }


    //solution
    public static int[] plusTwo(int[] a, int[] b) {

        return new int[]{a[0],a[1],b[0],b[1]};

    }
}
