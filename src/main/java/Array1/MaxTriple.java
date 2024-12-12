package Array1;


public class MaxTriple {

    public static void main(String[] args) {

        System.out.println(maxTriple(new int[]{1, 2, 3}));
        System.out.println(maxTriple(new int[]{1, 5, 3}));
        System.out.println(maxTriple(new int[]{5, 2, 3}));

    }


    //solution
    public static int maxTriple(int[] nums) {

        return Math.max(nums[0], Math.max(nums[nums.length / 2], nums[nums.length - 1]));

    }





    /*public static int maxTriple(int[] nums) {

        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];

        return (first > middle)
                ? (first > last ? first : last)
                : (middle > last ? middle : last);

    }*/


}
