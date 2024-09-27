package Recursion2;

public class GroupNoAdj {

    public static void main(String[] args) {

        int[] nums = {2, 5, 10, 4};


        System.out.println(groupNoAdj(0, nums, 12));
        System.out.println(groupNoAdj(0, nums, 14));
        System.out.println(groupNoAdj(0, nums, 7));


    }


    //solution
    public static boolean groupNoAdj(int start, int[] nums, int target) {

        if (target == 0) return true;

        if (start >= nums.length) return false;

        if (groupNoAdj(start + 2, nums, target - nums[start])) {
            return true;
        }

        if (groupNoAdj(start + 1, nums, target)) {
            return true;
        }

        return false;

    }


   /* public static boolean groupNoAdj(int start, int[] nums, int target) {

        if (target == 0) return true;

        if (start >= nums.length) return false;

        if (groupNoAdj(start + 2, nums, target - nums[start])) {
            return true;
        }

        if (groupNoAdj(start + 1, nums, target)) {
            return true;
        }

        return false;
    }*/
}
