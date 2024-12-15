package Warmup2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayCount9 {

    public static void main(String[] args) {

        System.out.println(arrayCount9(new int[]{1, 2, 9}));
        System.out.println(arrayCount9(new int[]{1, 9, 9}));
        System.out.println(arrayCount9(new int[]{1, 3, 9, 3, 9}));

    }


    //solution
    public static int arrayCount9(int[] nums) {

        int count9 = 0;

        for (int n : nums) {

            if (n == 9) {
                count9++;
            }

        }

        return count9;

    }



    //Solution with Stream API
   /* public static int arrayCount9(int[] nums) {

        return (int) Arrays.stream(nums)
                .filter(n -> n == 9)
                .count();

    }*/


   /* public static int arrayCount9(int[] nums) {

        return (int) IntStream.of(nums)
                .filter(n->n==9)
                .count();

    }*/

}
