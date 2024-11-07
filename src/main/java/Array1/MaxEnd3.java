package Array1;

import java.util.Arrays;

public class MaxEnd3 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(maxEnd3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(maxEnd3(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(maxEnd3(new int[]{7, 0, 0})));

    }


    //solution
    public static int[] maxEnd3(int[] nums) {

        return nums[0] > nums[2]
                ? (new int[]{nums[0], nums[0], nums[0]})
                : (new int[]{nums[2], nums[2], nums[2]});

    }


   /* public static int[] maxEnd3(int[] nums) {

        int max = Math.max(nums[0], nums[2]);

        return new int[]{max, max, max};


    }*/
}
