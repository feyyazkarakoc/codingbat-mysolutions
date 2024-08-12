package Array2;

public class Only14 {

    public static void main(String[] args) {

        int[] nums1 = {1, 4, 1, 4};
        int[] nums2 = {1, 4, 2, 4};
        int[] nums3 = {1, 1};
        System.out.println(only14(nums1));
        System.out.println(only14(nums2));
        System.out.println(only14(nums3));


    }


    //solution

    public static boolean only14(int[] nums) {

        for(int n : nums){
            if(n!=1 && n!=4){
                return false;
            }
        }
        return true;

    }



   /* public static boolean only14(int[] nums) {
        for (int n : nums){
            if (n!=1&&n!=4){
                return false;
            }
        }
        return true;
    }*/



   /* public static boolean only14(int[] nums) {
        boolean isValid = true;
        for (int n : nums) {
            if (n == 1 || n == 4) {
                isValid =  true;
            } else {
                isValid= false;
                break;
            }
        }
        return isValid;
    }*/
}
