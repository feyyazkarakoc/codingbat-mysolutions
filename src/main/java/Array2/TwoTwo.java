package Array2;

public class TwoTwo {


    public static void main(String[] args) {

        int[] nums1 = {4, 2, 2, 3};
        int[] nums2 = {2, 2, 4};
        int[] nums3 = {2, 2, 4, 2};
        System.out.println(twoTwo(nums1));
        System.out.println(twoTwo(nums2));
        System.out.println(twoTwo(nums3));


    }


    //solution

    public static boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (i + 1 < nums.length && nums[i + 1] == 2) {
                    i++;
                } else if (i == 0 || nums[i - 1] != 2) {
                    return false;
                }
            }
        }
        return true;
    }




  /*  public static boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {

            if (nums[i]==2){
                if (i+1<nums.length && nums[i+1]==2){
                    i++;
                } else if (i==0 || nums[i-1]!=2) {
                    return false;
                }
            }
        }
        return true;
    }*/
}
