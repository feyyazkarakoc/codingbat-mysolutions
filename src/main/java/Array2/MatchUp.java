package Array2;

public class MatchUp {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 3, 10};
        int[] nums3 = {2, 3, 5};
        int[] nums4 = {2, 3, 3};
        System.out.println(matchUp(nums1,nums2));
        System.out.println(matchUp(nums1,nums3));
        System.out.println(matchUp(nums1,nums4));

    }

    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {

            int diff = nums1[i] - nums2[i];
            if(diff<0){
                diff = -diff;
            }
            if (diff > 0 && diff <= 2) {
                count++;
            }
        }
        return count;
    }

}
