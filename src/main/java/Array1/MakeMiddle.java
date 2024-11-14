package Array1;

import java.util.Arrays;

public class MakeMiddle {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(makeMiddle(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(makeMiddle(new int[]{7, 1, 2, 3, 4, 9})));
        System.out.println(Arrays.toString(makeMiddle(new int[]{1, 2})));

    }


    //solution
    public static int[] makeMiddle(int[] nums) {

        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};

    }
}
