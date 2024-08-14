package Array2;

public class Either24 {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2};
        int[] nums2 = {4, 4, 1};
        int[] nums3 = {4, 4, 1, 2, 2};
        System.out.println(either24(nums1));
        System.out.println(either24(nums2));
        System.out.println(either24(nums3));


    }


    //solution

    public static boolean either24(int[] nums) {

        int count2 = 0;
        int count4 = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 2 && nums[i + 1] == 2) {
                count2++;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                count4++;
            }
        }
        return !((count2 > 0 && count4 > 0) || (count2 == 0 && count4 == 0));
    }
}
