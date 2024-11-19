package Array1;

import java.util.Arrays;

public class MidThere {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(midThree(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(midThree(new int[]{8, 6, 7, 5, 3, 0, 9})));
        System.out.println(Arrays.toString(midThree(new int[]{1, 2, 3})));

    }


    //solution
    public static int[] midThree(int[] nums) {

        int mid = nums.length / 2;

        return new int[]{nums[mid - 1], nums[mid], nums[mid + 1]};

    }
}
