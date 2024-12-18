package Warmup2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NoTriples {

    public static void main(String[] args) {

        System.out.println(noTriples(new int[]{1, 1, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 2, 1}));

    }


    //solution
    public static boolean noTriples(int[] nums) {


        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {

                return false;

            }

        }

        return true;

    }



    // solution with Stream API
   /* public static boolean noTriples(int[] nums){

        return IntStream
                .range(0,nums.length-2)
                .noneMatch(i->nums[i]==nums[i+1]&&nums[i+1]==nums[i+2]);
    }*/
}
