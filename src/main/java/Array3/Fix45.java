package Array3;

import java.util.Arrays;

public class Fix45 {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(fix45(new int[]{5, 4, 9, 4, 9, 5})));
        System.out.println(Arrays.toString(fix45(new int[]{1, 4, 1, 5})));
        System.out.println(Arrays.toString(fix45(new int[]{1, 4, 1, 5, 5, 4, 1})));

    }


    // solution :
    public static int[] fix45(int[] nums) {

        int index5 = 0;
        int len = nums.length;

        for (int i = 0; i < len; i++) {

            if (nums[i] == 4) {

                while (index5 < len && (nums[index5] != 5 || (index5 > 0 && nums[index5 - 1] == 4))) {
                    index5++;
                }


                if (index5 < len) {

                    int temp = nums[i + 1];
                    nums[i + 1] = nums[index5];
                    nums[index5] = temp;


                }


            }
        }


            return nums;
    }




    /*public static int[] fix45(int[] nums) {

        int index5 = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 4 && nums[i + 1] != 5) {

                while (nums[index5] != 5 || (index5 > 0 && nums[index5 - 1] == 4)) {
                    index5++;
                }

                int temp = nums[i + 1];
                nums[i + 1] = nums[index5];
                nums[index5] = temp;

            }

        }

        return nums;
    }*/



   /* public static int[] fix45(int[] nums) {
        int index5 = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 4 && nums[i + 1] != 5) {
                while (nums[index5] != 5 || (index5 > 0 && nums[index5 - 1] == 4)) {
                    index5++;
                }

                int temp = nums[i + 1];
                nums[i + 1] = nums[index5];
                nums[index5] = temp;
            }
        }
        return nums;
    }*/

}
