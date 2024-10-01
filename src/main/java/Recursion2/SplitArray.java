package Recursion2;

public class SplitArray {

    public static void main(String[] args) {

        int[] nums1 = {2, 2};
        int[] nums2 = {2, 3};
        int[] nums3 = {5, 2, 3};


        System.out.println(splitArray(nums1));
        System.out.println(splitArray(nums2));
        System.out.println(splitArray(nums3));


    }


    //solution
    public static boolean splitArray(int[] nums) {

        return splitArrayHelper(nums, 0, 0, 0);
    }

    public static boolean splitArrayHelper(int[] nums, int index, int group1Sum, int group2Sum) {

        if (index == nums.length) return group1Sum == group2Sum;

        if (splitArrayHelper(nums, index + 1, group1Sum + nums[index], group2Sum)) {
            return true;
        }

        if (splitArrayHelper(nums, index + 1, group1Sum, group2Sum + nums[index])) {
            return true;
        }

        return false;
    }







   /* public static boolean splitArray(int[] nums) {
        return splitArrayHelper(nums, 0, 0, 0);
    }


    public static boolean splitArrayHelper(int[] nums, int group1Sum, int group2Sum, int index) {

        if (index >= nums.length) return group1Sum == group2Sum;

        if (splitArrayHelper(nums, group1Sum + nums[index], group2Sum, index + 1)) {
            return true;
        }

        if (splitArrayHelper(nums, group1Sum, group2Sum + nums[index], index + 1)) {
            return true;
        }

        return false;
    }*/
}
