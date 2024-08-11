package Array2;

public class Lucky13 {

    public static void main(String[] args) {


        int[] num1 = {0, 2, 4};
        int[] num2 = {1, 2, 3};
        int[] num3 = {1, 2, 4};
        System.out.println(lucky13(num1));
        System.out.println(lucky13(num2));
        System.out.println(lucky13(num3));

    }


    //solution


    public static boolean lucky13(int[] nums) {
        for (int n : nums) {
            if (n == 1 || n == 3) {
                return false;
            }
        }
        return true;
    }
}
