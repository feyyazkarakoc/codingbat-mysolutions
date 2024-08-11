package Array2;

public class Has22 {

    public static void main(String[] args) {


        int[] num1 = {1, 2, 2};
        int[] num2 = {1, 2, 1, 2};
        int[] num3 = {2, 1, 2};
        System.out.println(has22(num1));
        System.out.println(has22(num2));
        System.out.println(has22(num3));

    }


    //solution


    public static boolean has22(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }

        return false;
    }
}
