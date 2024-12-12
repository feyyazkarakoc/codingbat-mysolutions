package Array1;

public class Unlucky1 {

    public static void main(String[] args) {

        System.out.println(unlucky1(new int[]{1, 3, 4, 5}));
        System.out.println(unlucky1(new int[]{2, 1, 3, 4, 5}));
        System.out.println(unlucky1(new int[]{1, 1, 1}));

    }


    //solution
    public static boolean unlucky1(int[] nums) {

        return nums.length >= 2 && ((nums[0] == 1 && nums[1] == 3)
                || (nums[1] == 1 && nums[2] == 3)
                || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3));

    }


}
