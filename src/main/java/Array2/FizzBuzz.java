package Array2;

import java.util.Arrays;

public class FizzBuzz {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(fizzBuzz(1, 6)));
        System.out.println(Arrays.toString(fizzBuzz(1, 8)));
        System.out.println(Arrays.toString(fizzBuzz(1, 11)));


    }


    //solution

    public static String[] fizzBuzz(int start,int end) {
        String[] arr = new String[end - start];
        String result = "";
        int index = 0;
        for (int i = start; i < end; i++) {
            if (i % 15 == 0) {
                result = "FizzBuzz";
            } else if (i % 5 == 0) {
                result = "Buzz";
            } else if (i % 3 == 0) {
                result = "Fizz";
            } else {
                result = String.valueOf(i);
            }
            arr[index++] = result;

        }
        return arr;
    }


   /* public static String[] fizzBuzz(int start,int end) {
        int index = 0;
        String[] arr = new String[end - start];
        String result = "";
        for (int i = start; i < end; i++) {
            if (i % 15 == 0) {
                result = "FizzBuzz";
            } else if (i % 5 == 0) {
                result = "Buzz";
            } else if (i % 3 == 0) {
                result = "Fizz";
            } else {
                result = String.valueOf(i);
            }
            arr[index++] = result;
        }
        return arr;
    }*/


   /* public static String[] fizzBuzz(int start,int end) {

        String[] arr = new String[end - start];
        for (int i = start; i < end; i++) {
            if (i % 15 == 0) {
                arr[i - start] = "FizzBuzz";
            } else if (i % 5 == 0) {
                arr[i - start] = "Buzz";
            } else if (i % 3 == 0) {
                arr[i - start] = "Fizz";
            } else {
                arr[i - start] = String.valueOf(i);
            }
        }
        return arr;
    }*/

}
