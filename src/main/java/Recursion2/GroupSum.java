package Recursion2;

public class GroupSum {

    public static void main(String[] args) {

        int[] arr = {2, 4, 8};


        System.out.println(groupSum(0, arr, 10));
        System.out.println(groupSum(0, arr, 14));
        System.out.println(groupSum(0, arr, 19));


    }


    //solution
    public static boolean groupSum(int start, int[] nums, int target) {
        if (nums[start]>=nums.length) return true;

    }

}
