package Array1;

import java.util.Arrays;

public class RotateLeft3 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(rotateLeft3(new int[]{2, 3, 1})));
        System.out.println(Arrays.toString(rotateLeft3(new int[]{11, 9, 5})));
        System.out.println(Arrays.toString(rotateLeft3(new int[]{0, 0, 7})));

    }


    //solution
    public static int[] rotateLeft3(int[] nums) {

        return new int[]{nums[1], nums[2], nums[0]};

    }
}
