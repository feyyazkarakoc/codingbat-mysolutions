package Warmup2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array123 {

    public static void main(String[] args) {

        System.out.println(array123(new int[]{1, 1, 2, 3, 1}));
        System.out.println(array123(new int[]{1, 1, 2, 4, 1}));
        System.out.println(array123(new int[]{1, 1, 2, 1, 2, 3}));

    }


    //solution
    public static boolean array123(int[] nums) {

        for (int i = 0; i < nums.length-2; i++) {

            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) {
                return true;
            }

        }

        return false;

    }






   /* public static boolean array123(int[] nums) {

        return IntStream
                .range(0, nums.length - 2)
                .anyMatch(i -> nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3);
    }*/

}
