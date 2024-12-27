package Array3;

public class CountClumps {

    public static void main(String[] args) {

        System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4}));
        System.out.println(countClumps(new int[]{1, 1, 2, 1, 1}));
        System.out.println(countClumps(new int[]{1, 1, 1, 1, 1}));


    }




    // solution 1 :
    public static int countClumps(int[] nums) {

        int countClump = 0;
        boolean inClump = false;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {

                if (!inClump) {
                    countClump++;
                    inClump = true;
                }

            } else {
                inClump = false;
            }

        }

        return countClump;
    }





    // solution 2 :
   /* public static int countClumps(int[] nums) {
        int countClump = 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > 1) countClump++;
                count = 1;
            }
        }
        if (count > 1) countClump++;
        return countClump;
    }*/


   /* public static int countClumps(int[] nums) {
        int countClump = 0;
        boolean inClump = false;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {

                if (!inClump) {
                    countClump++;
                    inClump = true;
                }
            } else {
                inClump = false;
            }
        }
        return countClump;
    }*/

}
