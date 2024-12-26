package Array3;

import java.util.Arrays;

public class MaxMirror {

    public static void main(String[] args) {

        System.out.println(maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        System.out.println(maxMirror(new int[]{1, 2, 1, 4}));
        System.out.println(maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));


    }


    // solution :
   /* public static int maxMirror(int[] nums) {


        int n = nums.length;
        int maxLen = 0;

        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = nums[n - 1 - i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;

                while ((i + count < n) && (j + count < n) && (nums[i + count] == reversed[j + count])) {
                    count++;
                }

                maxLen = Math.max(maxLen, count);

            }


        }

        return maxLen;


    }*/




    public static int maxMirror(int[] nums) {

        int n = nums.length;
        int maxLen = 0;

        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = nums[n - 1 - i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                while (i + count < n && j + count < n && nums[i + count] == reversed[j + count]) {
                    count++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }

}
