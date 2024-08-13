package Array2;

public class No14 {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {2, 3, 4};
        System.out.println(no14(nums1));
        System.out.println(no14(nums2));
        System.out.println(no14(nums3));


    }


    //solution

    public static boolean no14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for(int n : nums){
            if(n==1){
                count1++;
            }

            if(n==4){
                count4++;
            }
        }

        return count1 == 0 || count4 == 0;
    }





   /* public static boolean no14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int n : nums) {
            if (n == 1) {
                count1++;
            }

            if (n == 4) {
                count4++;
            }
        }
        return count1 == 0 || count4 == 0;
    }*/


  /*  public static boolean no14(int[] nums) {
        boolean has1 = false;
        boolean has4 = false;
        for (int n : nums) {
            if (n == 1) {
                has1 = true;
            }
            if (n == 4) {
                has4 = true;
            }
        }
        return !(has1 && has4);
    }*/




}



