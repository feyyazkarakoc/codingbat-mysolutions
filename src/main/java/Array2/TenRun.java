package Array2;

import java.util.Arrays;

public class TenRun {

    public static void main(String[] args) {

        int[] nums1 = {2, 10, 3, 4, 20, 5};
        int[] nums2 = {10, 1, 20, 2};
        int[] nums3 = {10, 1, 9, 20};
        System.out.println(Arrays.toString(tenRun(nums1)));
        System.out.println(Arrays.toString(tenRun(nums2)));
        System.out.println(Arrays.toString(tenRun(nums3)));


    }


    //solution

    public static int[] tenRun(int[] nums) {
        int[] arr = new int[nums.length];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                arr[i] = nums[i];

            } else if (i > 0 && arr[i - 1] % 10 == 0) {
                arr[i] = arr[i - 1];

            } else {
                arr[i] = nums[i];
            }
        }

        return arr;
    }


   /* public static int[] tenRun(int[] nums) {
        int multiply = -1;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] % 10) == 0) {
                multiply = nums[i];
            } else if (multiply != -1) {
                nums[i] = multiply;
            }
        }
        return nums;
    }*/


   /* public static int[] tenRun(int[] nums) {
        int multiply = -1;
        for (int i = 0; i < nums.length ; i++) {
           if (nums[i]%10==0){
               multiply=nums[i];
           } else if (multiply!=-1) {
               nums[i]=multiply;
           }
        }
        return nums;
    }*/


}
