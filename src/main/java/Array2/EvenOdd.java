package Array2;

import java.util.Arrays;

public class EvenOdd {

    public static void main(String[] args) {

        int[] nums1 = {1, 0, 1, 0, 0, 1, 1};
        int[] nums2 = {0, 4, 0, 3};
        int[] nums3 = {2, 2, 2};
        System.out.println(Arrays.toString(evenOdd(nums1)));
        System.out.println(Arrays.toString(evenOdd(nums2)));
        System.out.println(Arrays.toString(evenOdd(nums3)));


    }


    //solution
    public static int[] evenOdd(int[] nums) {
        int index = 0;
        int[] arr = new int[nums.length];
        for (int num : nums) {
            if (num % 2 == 0) {
                arr[index++] = num;
            }
        }
        for (int num : nums) {
            if (num % 2 == 1) {
                arr[index++] = num;
            }
        }
        return arr;
    }
}
