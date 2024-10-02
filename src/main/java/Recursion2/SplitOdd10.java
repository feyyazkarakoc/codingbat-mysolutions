package Recursion2;

public class SplitOdd10 {

    public static void main(String[] args) {

        int[] nums1 = {5, 5, 5};
        int[] nums2 = {5, 5, 6};
        int[] nums3 = {5, 5, 6, 1};


        System.out.println(splitOdd10(nums1));
        System.out.println(splitOdd10(nums2));
        System.out.println(splitOdd10(nums3));


    }


    //solution
    public static boolean splitOdd10(int[] nums) {

        return splitOdd10Helper(nums, 0, 0, 0);
    }

    public static boolean splitOdd10Helper(int[] nums, int index, int group1Sum, int group2Sum) {

        if (index == nums.length) return group1Sum % 10 == 0 && group2Sum % 2 == 1;

        if (splitOdd10Helper(nums, index + 1, group1Sum + nums[index], group2Sum)) {
            return true;
        }

        if (splitOdd10Helper(nums, index + 1, group1Sum, group2Sum + nums[index])) {
            return true;
        }

        return false;

    }







   /* public static boolean splitOdd10(int[] nums) {
        return splitOdd10Helper(nums,0,0,0);
    }

   public static boolean splitOdd10Helper(int[] nums, int group1Sum, int group2Sum, int index) {

        if (index >= nums.length) return (group1Sum % 10 == 0) && (group2Sum % 2 == 1);

        if (splitOdd10Helper(nums, group1Sum + nums[index], group2Sum, index + 1)) {
            return true;
        }

        if (splitOdd10Helper(nums, group1Sum, group2Sum + nums[index], index + 1)) {
            return true;
        }

        return false;

    }*/
}
