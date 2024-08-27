package Array2;

import java.util.Arrays;

public class WithoutTen {

    public static void main(String[] args) {

        int[] nums1 = {1, 10, 10, 2};
        int[] nums2 = {10, 2, 10};
        int[] nums3 = {1, 99, 10};
        System.out.println(Arrays.toString(withoutTen(nums1)));
        System.out.println(Arrays.toString(withoutTen(nums2)));
        System.out.println(Arrays.toString(withoutTen(nums3)));



    }


    //solution
    public static int[] withoutTen(int[] nums) {
        int firstIndex = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                arr[firstIndex++] = nums[i];
            }
        }
        return arr;
    }
}
