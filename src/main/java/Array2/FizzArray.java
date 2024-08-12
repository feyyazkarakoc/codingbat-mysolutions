package Array2;

import java.util.Arrays;

public class FizzArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(fizzArray(4)));
        System.out.println(Arrays.toString(fizzArray(1)));
        System.out.println(Arrays.toString(fizzArray(10)));

    }



    //solution
    public static int[] fizzArray(int n) {
        int[] nums  = new int[n];
        if(n>0){
            for(int i = 0; i<n;i++){
                nums[i]=i;
            }

        }
        return nums;
    }
}
