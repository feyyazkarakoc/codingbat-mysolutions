package Array2;

import java.util.Arrays;

public class FizzArray2 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(fizzArray2(4)));
        System.out.println(Arrays.toString(fizzArray2(10)));
        System.out.println(Arrays.toString(fizzArray2(2)));

    }




    //solution


    public static String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for(int i = 0; i<n;i++){
            arr[i]=""+i;

        }
        return arr;
    }




   /* public static String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n ; i++) {
            arr[i]=String.valueOf(i);
        }

        return  arr;
    }*/
}
