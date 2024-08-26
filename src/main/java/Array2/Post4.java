package Array2;

import java.util.Arrays;

public class Post4 {

    public static void main(String[] args) {

        int[] nums1 = {2, 4, 1, 2};
        int[] nums2 = {4, 1, 4, 2};
        int[] nums3 = {4, 4, 1, 2, 3};
        System.out.println(Arrays.toString(post4(nums1)));
        System.out.println(Arrays.toString(post4(nums2)));
        System.out.println(Arrays.toString(post4(nums3)));


    }


    //solution
    public static int[] post4(int[] nums) {
        int len = nums.length;
        int count = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                count = i;
                break;
            }
        }
        int newLen = len - count - 1;
        int[] arr = new int[newLen];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[count + 1 + i];
        }
        return arr;

    }







   /* public static int[] post4(int[] nums) {
        int len = nums.length;
        int count = len - 1;
        while (nums[count] != 4) {
            count--;
        }
        int newLen = len - count - 1;
        int[] arr = new int[newLen];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[count + 1 + i];
        }
        return arr;

    }*/
}
