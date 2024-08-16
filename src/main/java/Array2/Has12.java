package Array2;

public class Has12 {

    public static void main(String[] args) {

        int[] num1 = {1, 3, 2};
        int[] num2 = {3, 1, 2};
        int[] num3 = {3, 1, 4, 5, 2};
        System.out.println(has12(num1));
        System.out.println(has12(num2));
        System.out.println(has12(num3));
    }


    //solution


    public static boolean has12(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == 2) {
                        return true;

                    }

                }
            }
        }
        return false;
    }
}
