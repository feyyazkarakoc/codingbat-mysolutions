package Array3;

import java.util.Arrays;

public class Fix45 {



    public static void main(String[] args) {

        System.out.println(Arrays.toString(fix34(new int[]{1, 3, 1, 4})));
        System.out.println(Arrays.toString(fix34(new int[]{1, 3, 1, 4, 4, 3, 1})));
        System.out.println(Arrays.toString(fix34(new int[]{3, 2, 2, 4})));

    }


    // solution 1 :
    public static int[] fix34(int[] nums) {

        int len = nums.length;
        int index4 = 0;

        for (int i = 0; i < len; i++) {

            if (nums[i] == 3) {

                while (nums[index4] != 4) {
                    index4++;
                }

                int temp = nums[i + 1];
                nums[i + 1] = nums[index4];
                nums[index4] = temp;

            }
        }

        return nums;
    }


}
