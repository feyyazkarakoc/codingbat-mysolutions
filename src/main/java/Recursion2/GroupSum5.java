package Recursion2;

public class GroupSum5 {

    public static void main(String[] args) {

        int[] nums = {2, 5, 10, 4};


        System.out.println(groupSum5(0, nums, 12));
        System.out.println(groupSum5(0, nums, 14));
        System.out.println(groupSum5(0, nums, 7));

    }


    //solution
    public static boolean groupSum5(int start, int[] nums, int target) {

        if (start >= nums.length && target == 0) return true;
        if (start >= nums.length) return false;
        if (nums[start] % 5 == 0) {
            if (start + 1 < nums.length && nums[start + 1] == 1) {
                return groupSum5(start + 2, nums, target - nums[start]);
            }
            return groupSum5(start + 1, nums, target - nums[start]);
        }


        if (groupSum5(start + 1, nums, target - nums[start])) {
            return true;
        }
        if (groupSum5(start + 1, nums, target)) {
            return true;
        }
        return false;

    }
}
