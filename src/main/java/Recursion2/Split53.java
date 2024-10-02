package Recursion2;

public class Split53 {

    public static void main(String[] args) {

        int[] nums1 = {1, 1};
        int[] nums2 = {1, 1, 1};
        int[] nums3 = {2, 4, 2};


        System.out.println(split53(nums1));
        System.out.println(split53(nums2));
        System.out.println(split53(nums3));


    }


    //solution

   /* public static boolean split53(int[] nums) {

        return split53Helper(nums, 0, 0, 0);
    }



    public static boolean split53Helper(int[] nums, int index, int group1Sum, int group2Sum) {

        if (index == nums.length) return group1Sum == group2Sum;

        if (nums[index] % 5 == 0) {
            return split53Helper(nums, index + 1, group1Sum + nums[index], group2Sum);
        }

        if (nums[index] % 3 == 0) {
            return split53Helper(nums, index + 1, group1Sum, group2Sum + nums[index]);
        }

        if (split53Helper(nums, index + 1, group1Sum + nums[index], group2Sum)) {
            return true;
        }

        if (split53Helper(nums, index + 1, group1Sum, group2Sum + nums[index])) {
            return true;
        }

        return false;

    }*/








   /* public static boolean split53(int[] nums) {

        return split53Helper(nums, 0, 0, 0);
    }



    public static boolean split53Helper(int[] nums, int index, int group1Sum, int group2Sum) {

        if (index == nums.length) return group1Sum == group2Sum;

        int current = nums[index];

        if (current % 5 == 0) {
            return split53Helper(nums, index + 1, group1Sum + current, group2Sum);
        }

        if (current % 3 == 0) {
            return split53Helper(nums, index + 1, group1Sum, group2Sum + current);
        }

        return split53Helper(nums, index + 1, group1Sum + current, group2Sum) ||
                split53Helper(nums, index + 1, group1Sum, group2Sum + current);
    }*/


    public static boolean split53(int[] nums) {
        return split53Helper(nums, 0, 0, 0);
    }

    public static boolean split53Helper(int[] nums, int group1Sum, int group2Sum, int index) {

        if (index >= nums.length) return group1Sum == group2Sum;

        int current = nums[index];

        if (current % 5 == 0) {
            return split53Helper(nums, group1Sum + current, group2Sum, index + 1);
        }

        if (current % 3 == 0) {
            return split53Helper(nums, group1Sum, group2Sum + current, index + 1);
        }

        if (split53Helper(nums, group1Sum + current, group2Sum, index + 1)) {
            return true;
        }

        if (split53Helper(nums, group1Sum, group2Sum + current, index + 1)) {
            return true;
        }

        return false;
    }
}
