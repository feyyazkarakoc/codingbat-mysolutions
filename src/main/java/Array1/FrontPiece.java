package Array1;

import java.util.Arrays;

public class FrontPiece {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(frontPiece(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(frontPiece(new int[]{1, 2})));
        System.out.println(Arrays.toString(frontPiece(new int[]{1})));

    }


    //solution
    public static int[] frontPiece(int[] nums) {

        return nums.length >= 2 ? new int[]{nums[0], nums[1]} : nums;

    }
}
