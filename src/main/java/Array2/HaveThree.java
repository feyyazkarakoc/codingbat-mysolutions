package Array2;

public class HaveThree {

    public static void main(String[] args) {


        int[] num1 = {3, 1, 3, 1, 3};
        int[] num2 = {3, 1, 3, 3};
        int[] num3 = {3, 4, 3, 3, 4};
        System.out.println(haveThree(num1));
        System.out.println(haveThree(num2));
        System.out.println(haveThree(num3));

    }


    //solution

    public static boolean haveThree(int[] nums) {
        int count3 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count3++;
                i++;
            }
        }
        return count3 == 3;
    }
}
