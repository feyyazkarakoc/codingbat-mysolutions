package Warmup2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayFront9 {

    public static void main(String[] args) {

        System.out.println(arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 9}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 5}));

    }


    //solution
    public static boolean arrayFront9(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (i < 4 && nums[i] == 9) {
                return true;
            }

        }

        return false;

    }




   /* public static boolean arrayFront9(int[] nums) {

        for (int i = 0; i < Math.min(4, nums.length); i++) {

            if (nums[i] == 9) {
                return true;
            }

        }

        return false;

    }*/




    /*public static boolean arrayFront9(int[] nums) {

        int i = 0;

        while (i < Math.min(4, nums.length)) {

            if (nums[i] == 9) return true;

            i++;

        }

        return false;
    }*/


   /* public static boolean arrayFront9(int[] nums) {

        return IntStream
                .range(0, Math.min(4, nums.length))
                .anyMatch(i -> nums[i] == 9);
    }*/


   /* public static boolean arrayFront9(int[] nums) {

        return nums.length < 4 ?
                IntStream.of(nums).anyMatch(n -> n == 9)
                : IntStream.range(0, 4).anyMatch(i -> nums[i] == 9);
    }*/

   /* public static boolean arrayFront9(int[] nums) {

        return Arrays
                .stream(nums)
                .limit(4)
                .anyMatch(n->n==9);
    }*/





}
