package Array2;

import java.util.Arrays;

public class ShiftLeft {

    public static void main(String[] args) {

        int[] nums1 = {6, 2, 5, 3};
        int[] nums2 = {1, 2};
        int[] nums3 = {1};
        System.out.println(Arrays.toString(shiftLeft(nums1)));
        System.out.println(Arrays.toString(shiftLeft(nums2)));
        System.out.println(Arrays.toString(shiftLeft(nums3)));


    }


    //solution

    public static int[] shiftLeft(int[] nums) {
        int[] arr = new int[nums.length];
        if (nums.length > 0) {
            arr[nums.length - 1] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                arr[i - 1] = nums[i];

            }
        }
        return arr;
    }

}
