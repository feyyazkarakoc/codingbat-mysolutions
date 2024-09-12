package Recursion1;

public class Array220 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 20};
        int[] arr2 = {3, 30};
        int[] arr3 = {3};

        System.out.println(array220(arr1, 0));
        System.out.println(array220(arr2, 0));
        System.out.println(array220(arr3, 0));
    }


    //solution

    public static boolean array220(int[] nums, int index) {
        if (index >= nums.length - 1) return false;
        return nums[index] * 10 == nums[index + 1] ? true : array220(nums, index + 1);


    }
}
