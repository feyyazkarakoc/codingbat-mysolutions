package Array3;

import java.util.Arrays;

public class CanBalance {


    public static void main(String[] args) {

        System.out.println(canBalance(new int[]{5, 4, 9, 4, 9, 5}));
        System.out.println(canBalance(new int[]{1, 4, 1, 5}));
        System.out.println(canBalance(new int[]{1, 4, 1, 5, 5, 4, 1}));

    }


    // solution :
    public static boolean canBalance(int[] nums) {

        int totalSum = 0;
        int leftSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int num : nums) {

            leftSum+=num;

            if (leftSum == totalSum-leftSum) return true;
        }

        return false;
    }

}
