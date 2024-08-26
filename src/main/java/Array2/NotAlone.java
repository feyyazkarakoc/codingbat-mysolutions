package Array2;

import java.util.Arrays;

public class NotAlone {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3, 2, 5, 2};
        int[] nums3 = {3, 4};
        System.out.println(Arrays.toString(notAlone(nums1, 2)));
        System.out.println(Arrays.toString(notAlone(nums2, 2)));
        System.out.println(Arrays.toString(notAlone(nums3, 3)));


    }


    public static int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val & nums[i - 1] != nums[i] & nums[i] != nums[i + 1]) {
                if (nums[i - 1] > nums[i + 1]) {
                    nums[i] = nums[i - 1];
                } else {
                    nums[i] = nums[i + 1];
                }
            }
        }
        return nums;
    }
}
