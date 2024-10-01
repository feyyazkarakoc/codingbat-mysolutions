package Recursion2;

public class GroupSumClump {

    public static void main(String[] args) {

        int[] nums1 = {2, 4, 8};
        int[] nums2 = {1, 2, 4, 8, 1};
        int[] nums3 = {2, 4, 4, 8};


        System.out.println(groupSumClump(0, nums1, 10));
        System.out.println(groupSumClump(0, nums2, 14));
        System.out.println(groupSumClump(0, nums3, 14));


    }


    //solution
    public static boolean groupSumClump(int start, int[] nums, int target) {

        if (start >= nums.length && target == 0) return true;

        if (start >= nums.length) return false;

        int sum = nums[start];

        int count = 1;

        while (start + count < nums.length && nums[start] == nums[start + count]) {
            sum += nums[start + count];
            count++;
        }

        if (groupSumClump(start + count, nums, target - sum)) {
            return true;
        }

        if (groupSumClump(start + count, nums, target)) {
            return true;
        }

        return false;
    }







  /*  public static boolean groupSumClump(int start, int[] nums, int target) {

        if (start >= nums.length && target == 0) return true;

        if (start >= nums.length) return false;

        int sum = nums[start];
        int count = 1;
        while (start + count < nums.length && nums[start] == nums[start + count]) {
            sum += nums[start + count];
            count++;
        }

        if (groupSumClump(start + count, nums, target - sum)) {
            return true;
        }

        if (groupSumClump(start + count, nums, target)) {
            return true;
        }

        return false;
    }*/







  /*  public static boolean groupSumClump(int start, int[] nums, int target) {

        if (start >= nums.length) return target == 0;

        int sum = nums[start];

        int count = 1;

        while (start + count < nums.length && nums[start] == nums[start + count]) {
            sum += nums[start + count];
            count++;
        }

        return groupSumClump(start + count, nums, target - sum) ||
                groupSumClump(start + count, nums, target);

    }*/
}
