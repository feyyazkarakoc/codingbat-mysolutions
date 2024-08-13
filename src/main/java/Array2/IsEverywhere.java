package Array2;

public class IsEverywhere {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 1, 3};
        int[] nums2 = {1, 2, 1, 3};
        int[] nums3 = {1, 2, 1, 3, 4};
        System.out.println(isEverywhere(nums1,1));
        System.out.println(isEverywhere(nums2,2));
        System.out.println(isEverywhere(nums3,4));


    }


    //solution

    public static boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }

        }
        return true;
    }
}
