package Array1;

public class Has23 {

    public static void main(String[] args) {

        System.out.println(has23(new int[]{2, 5}));
        System.out.println(has23(new int[]{4, 3}));
        System.out.println(has23(new int[]{4, 5}));

    }


    //solution
    public static boolean has23(int[] nums) {

        return nums[0] == 2 ||
                nums[0] == 3 ||
                nums[1] == 2 ||
                nums[1] == 3;

    }
}
