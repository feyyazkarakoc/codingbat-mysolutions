package Array2;

public class Has77 {

    public static void main(String[] args) {

        int[] num1 = {1, 7, 7};
        int[] num2 = {1, 7, 1, 7};
        int[] num3 = {1, 7, 1, 1, 7};
        System.out.println(has77(num1));
        System.out.println(has77(num2));
        System.out.println(has77(num3));
    }


    //solution


    public static boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7) {
                if (nums[i + 1] == 7 || (i < nums.length - 2 && nums[i + 2] == 7)) {
                    return true;
                }
            }
        }
        return false;
    }


  /*  public static boolean has77(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 7) {
                if ((i+1<nums.length&&nums[i + 1] == 7) || (i +2 < nums.length && nums[i + 2] == 7)) {
                    return true;
                }
            }

        }

        return false;
    }*/





   /* public static boolean has77(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {

            if (nums[i]==7&&((i+1<nums.length&&nums[i+1]==7)||(i+2<nums.length&&nums[i+2]==7))){
                return true;
            }

        }

        return false;
    }*/
}
