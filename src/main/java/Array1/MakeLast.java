package Array1;

import java.util.Arrays;

public class MakeLast {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(makeLast(new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(makeLast(new int[]{1, 2})));
        System.out.println(Arrays.toString(makeLast(new int[]{3})));

    }


    //solution
    public static int[] makeLast(int[] nums) {

        int[] arr = new int[nums.length * 2];
        arr[arr.length - 1] = nums[nums.length - 1];
        return arr;

    }
}
