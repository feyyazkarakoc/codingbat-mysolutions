package Recursion2;

public class GroupSum6 {

    public static void main(String[] args) {

        int[] nums = {5, 6, 2};


        System.out.println(groupSum6(0, nums, 8));
        System.out.println(groupSum6(0, nums, 9));
        System.out.println(groupSum6(0, nums, 7));


    }


    //solution
    public static boolean groupSum6(int start, int[] nums, int target) {

        if (start >= nums.length && target == 0) return true;

        if (start >= nums.length) return false;

        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - nums[start]);
        }

        if (groupSum6(start + 1, nums, target - nums[start])) {
            return true;
        }

        if (groupSum6(start + 1, nums, target)) {
            return true;
        }

        return false;

    }
}
