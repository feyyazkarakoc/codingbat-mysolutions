package Array3;

import java.util.Arrays;

public class CanBalance {


    public static void main(String[] args) {

        System.out.println(canBalance(new int[]{5, 4, 9, 4, 9, 5}));
        System.out.println(canBalance(new int[]{1, 4, 1, 5}));
        System.out.println(canBalance(new int[]{1, 4, 1, 5, 5, 4, 1}));

    }


    // solution 1 :
    public static boolean canBalance(int[] nums) {

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

}
