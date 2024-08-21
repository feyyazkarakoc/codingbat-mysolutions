package Array2;

public class SameEnds {

    public static void main(String[] args) {

        int[] nums1 = {5, 6, 45, 99, 13, 5, 6};
        int[] nums2 = {5, 6, 45, 99, 13, 5, 6};
        int[] nums3 = {5, 6, 45, 99, 13, 5, 6};
        System.out.println(sameEnds(nums1,1));
        System.out.println(sameEnds(nums2,2));
        System.out.println(sameEnds(nums3,3));


    }


    //solution

    public static boolean sameEnds(int[] nums,int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }
}
