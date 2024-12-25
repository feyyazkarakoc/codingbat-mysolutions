package Array3;

import java.util.Arrays;

public class SeriesUp {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(seriesUp(3)));
        System.out.println(Arrays.toString(seriesUp(4)));
        System.out.println(Arrays.toString(seriesUp(2)));

    }


    // solution :
   /* public static int[] seriesUp(int n) {

        int size = n * (n + 1) / 2;
        int[] result = new int[size];
        int index = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                result[index++] = j;
            }
        }

        return result;
    }*/




    public static int[] seriesUp(int n) {
        int size = n * (n + 1) / 2;
        int[] result = new int[size];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[index++] = j;
            }
        }
        return result;
    }


}
