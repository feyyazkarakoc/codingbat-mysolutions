package Array2;

import java.util.Arrays;

public class Pre4 {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 4, 1};
        int[] nums2 = {3, 1, 4};
        int[] nums3 = {1, 4, 4};
        System.out.println(Arrays.toString(pre4(nums1)));
        System.out.println(Arrays.toString(pre4(nums2)));
        System.out.println(Arrays.toString(pre4(nums3)));


    }


    //solution

   public static int[] pre4(int[] nums) {
        int count = 0;
        int[] arr = new int[count];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                count = i;
                arr = new int[count];
                for (int j = 0; j < count; j++) {
                    arr[j] = nums[j];
                }
                break;
            }
        }
        return arr;
    }






   /* public static int[] pre4(int[] nums) {
        int count = 0;
        while (nums[count] != 4) {
            count++;
        }
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i]=nums[i];

        }
        return arr;
    }*/






   /* public static int[] pre4(int[] nums) {
        int count = 0;
        while (nums[count] != 4){
            count++;
        }
        int[] arr = new int[count];
        for (int i = 0; i < count ; i++) {
            arr[i]=nums[i];
        }
        return arr;
    }*/
}
