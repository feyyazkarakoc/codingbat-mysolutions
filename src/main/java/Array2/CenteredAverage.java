package Array2;

import java.util.Arrays;

public class CenteredAverage {

    public static void main(String[] args) {

        int[] num1 = {1, 2, 3, 4, 100};
        int[] num2 = {1, 1, 5, 5, 10, 8, 7};
        int[] num3 = {-10, -4, -2, -4, -2, 0};
        System.out.println(centeredAverage(num1));
        System.out.println(centeredAverage(num2));
        System.out.println(centeredAverage(num3));
    }

    //solution

    public static int centeredAverage(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            sum += nums[i];
        }
        return sum / (nums.length - 2);
    }

}
