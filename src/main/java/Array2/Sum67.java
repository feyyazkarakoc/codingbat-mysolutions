package Array2;

public class Sum67 {

    public static void main(String[] args) {

        int[] num1 = {1, 2, 2};
        int[] num2 = {1, 2, 2, 6, 99, 99, 7};
        int[] num3 = {1, 1, 6, 7, 2};
        System.out.println(sum67(num1));
        System.out.println(sum67(num2));
        System.out.println(sum67(num3));
    }


    //solution


    public static int sum67(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {

                while (i < nums.length && nums[i] != 7) {
                    i++;
                }

            } else {

                sum += nums[i];
            }
        }

        return sum;
    }




   /* public static int sum67(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]==6){
                while (i<nums.length&&nums[i]!=7){
                    i++;
                }
            }else {
                sum+=nums[i];
            }
        }
        return sum;
    }*/






   /* public static int sum67(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]==6){
                while (i<nums.length && nums[i]!=7){
                    i++;
                }
            }else {
                sum+=nums[i];
            }
        }
        return sum;
    }*/



   /* public static int sum67(int[] nums) {
        int sum = 0;
        boolean skip = false;

        for (int i = 0; i < nums.length ; i++) {

            if (nums[i]==6){
                skip=true;
            }else if (nums[i]==7&&skip){
                skip=false;
            }else if (!skip){
                sum+=nums[i];
            }

        }

        return sum;
    }*/


   /* public static int sum67(int[] nums) {
        int sum = 0;
        boolean skip = false;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 6) {
                skip = true;
            } else if (nums[i] == 7 && skip) {
                skip = false;
            } else if (!skip) {
                sum += nums[i];
            }
        }
        return sum;
    }*/


}
