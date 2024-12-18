package Warmup2;

import java.util.stream.IntStream;

public class Has271 {

    public static void main(String[] args) {

        System.out.println(has271(new int[]{1, 2, 7, 1}));
        System.out.println(has271(new int[]{1, 2, 8, 1}));
        System.out.println(has271(new int[]{2, 7, 1}));

    }


    //solution
    public static boolean has271(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i + 1] == nums[i] + 5 && (Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2)) {

                return true;
            }

        }

        return false;


    }



    /*public static boolean has271(int[] nums) {

        return IntStream
                .range(0,nums.length-2)
                .anyMatch(i->nums[i+1]==nums[i]+5&&(Math.abs(nums[i+2]-(nums[i]-1))<=2));
    }*/

}
