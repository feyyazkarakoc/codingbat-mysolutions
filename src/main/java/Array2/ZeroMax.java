package Array2;

import java.util.Arrays;

public class ZeroMax {

    public static void main(String[] args) {

        int[] nums1 = {0, 5, 0, 3};
        int[] nums2 = {0, 4, 0, 3};
        int[] nums3 = {0, 1, 0};
        System.out.println(Arrays.toString(zeroMax(nums1)));
        System.out.println(Arrays.toString(zeroMax(nums2)));
        System.out.println(Arrays.toString(zeroMax(nums3)));


    }


    //solution
   /* public static int[] zeroMax(int[] nums) {
        int largestOdd = -1;
        for (int i = nums.length-1; i >=0 ; i--) {
            if (nums[i]%2==1){
                largestOdd=Math.max(largestOdd,nums[i]);

            } else if (nums[i]==0&largestOdd!=-1) {
                nums[i]=largestOdd;

            }
        }
        return nums;
    }*/



    public static int[] zeroMax(int[] nums) {
        int largestOdd = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 1) {
                largestOdd = Math.max(largestOdd, nums[i]);
            } else if (nums[i] == 0 & largestOdd != -1) {
                nums[i] = largestOdd;
            }
        }
        return nums;
    }









   /* public static int[] zeroMax(int[] nums) {
        int largestOdd = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 1) {
                largestOdd = Math.max(nums[i], largestOdd);
            } else if (nums[i] == 0 & largestOdd != Integer.MIN_VALUE) {
                nums[i] = largestOdd;
            }
        }
        return nums;
    }*/






}
