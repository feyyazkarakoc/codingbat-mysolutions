package Array2;

import java.util.Arrays;

public class ZeroFront {
    public static void main(String[] args) {

        int[] nums1 = {5, 6, 7,0, 1};
        int[] nums2 = {0, 1, 1, 0, 1};
        int[] nums3 = {1, 0};
        System.out.println(Arrays.toString(zeroFront(nums1)));
        System.out.println(Arrays.toString(zeroFront(nums2)));
        System.out.println(Arrays.toString(zeroFront(nums3)));



    }


    //solution
      public static int[] zeroFront(int[] nums) {
        int[] arr = new int[nums.length];
        int countZero = 0;
        for (int num : nums) {
            if (num == 0) {
                countZero++;
            }
        }

        for (int num : nums) {
            if (num != 0) {
                arr[countZero] = num;
                countZero++;

            }
        }
        return arr;
    }


  /*  public static int[] zeroFront(int[] nums) {
        int lastIndex = nums.length-1;
        int[] arr = new int[nums.length];
        for (int num : nums) {
            if (num != 0) {
                arr[lastIndex--] = num;
            }
        }
        return arr;
    }*/






   /* public static int[] zeroFront(int[] nums) {
        int pos = 0;
        int[] arr = new int[nums.length];
        for (int num : nums) {
            if (num == 0) {
                arr[pos++] = 0;
            }
        }
        for (int num : nums) {
            if (num != 0) {
                arr[pos++] = num;
            }
        }
        return arr;
    }*/















}
