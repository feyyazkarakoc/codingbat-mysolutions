package Array2;

public class BigDiff {

    public static void main(String[] args) {

        int[] num1 = {10, 3, 5, 6};
        int[] num2 = {7, 2, 10, 9};
        int[] num3 = {2, 10, 7, 2};
        System.out.println(bigDiff(num1));
        System.out.println(bigDiff(num2));
        System.out.println(bigDiff(num3));
    }


    //solution
    public static int bigDiff(int[] nums) {

        int min = nums[0];
        int max = nums[0];
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;

    }



   /* public static int bigDiff(int[] nums) {

        int min = nums[0];
        int max = nums[0];
        for (int n : nums){
            min = Math.min(n,min);
            max = Math.max(n,max);
        }

        return max-min;

    }*/
}
