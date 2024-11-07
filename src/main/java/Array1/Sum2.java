package Array1;

public class Sum2 {

    public static void main(String[] args) {

        System.out.println(sum2(new int[]{1, 2, 3}));
        System.out.println(sum2(new int[]{1,1}));
        System.out.println(sum2(new int[]{1,1,1,1}));

    }


    //solution
    public static int sum2(int[] nums) {

        return nums.length >= 2
                ? (nums[0] + nums[1])
                : (nums.length == 0
                ? 0 : nums[0]);

    }
}
