package Array2;

public class ModThree {

    public static void main(String[] args) {


        int[] num1 = {2, 1, 3, 5};
        int[] num2 = {2, 1, 2, 5};
        int[] num3 = {2, 4, 2, 5};
        System.out.println(modThree(num1));
        System.out.println(modThree(num2));
        System.out.println(modThree(num3));

    }


    //solution


    public static boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (i + 1 < nums.length && nums[i + 1] % 2 == 0) {
                    if (i + 2 < nums.length && nums[i + 2] % 2 == 0) {
                        return true;
                    }
                }
            }

            if (nums[i] % 2 == 1) {
                if (i + 1 < nums.length && nums[i + 1] % 2 == 1) {
                    if (i + 2 < nums.length && nums[i + 2] % 2 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
