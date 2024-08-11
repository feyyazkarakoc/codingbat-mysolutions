package Array2;

public class Sum28 {

    public static void main(String[] args) {


        int[] num1 = {2, 3, 2, 2, 4, 2};
        int[] num2 = {2, 3, 2, 2, 4, 2, 2};
        int[] num3 = {1, 2, 3, 4};
        System.out.println(sum28(num1));
        System.out.println(sum28(num2));
        System.out.println(sum28(num3));

    }


    //solution


    public static boolean sum28(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            if (n == 2) {
                sum += n;
            }
        }
        return sum == 8;
    }
}
