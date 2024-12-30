package Array3;

import java.util.Arrays;

public class SquareUp {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(squareUp(3)));
        System.out.println(Arrays.toString(squareUp(2)));
        System.out.println(Arrays.toString(squareUp(4)));

    }


    // solution :
    public static int[] squareUp(int n) {

        int[] result = new int[n * n];

        for (int row = 1; row <= n; row++) {
            int start = row * n - 1;
            for (int num = 1; num <= row; num++) {
                result[start--] = num;
            }
        }

        return result;
    }


   /* public static int[] squareUp(int n) {
        int[] result = new int[n * n];
        for (int row = 1; row <= n; row++) {
            int start = row * n - 1;
            for (int num = 1; num <= row; num++) {
                result[start--] = num;
            }
        }
        return result;
    }*/


    /*public static int[] squareUp(int n) {
        int[] result = new int[n * n];
        for (int row = 1; row <= n; row++) {
            int start = row * n - 1;
            for (int num = 1; num <= row; num++) {
                result[start--] = num;
            }
        }
        return result;
    }*/



   /* public static int[] squareUp(int n) {
        int[] result = new int[n * n];
        for (int i = 1; i <= n; i++) {
            int lastIndex = i * n - 1;
            for (int j = 1; j <= i; j++) {
                result[lastIndex--] = j;
            }
        }
        return result;
    }*/


}
