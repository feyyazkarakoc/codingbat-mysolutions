package Recursion1;

public class Array6 {

    public static void main(String[] args) {

        int[] arr1 = {1,6,4};
        int[] arr2 = {1,4};
        int[] arr3 = {6};

        System.out.println(array6(arr1,0));
        System.out.println(array6(arr2,0));
        System.out.println(array6(arr3,0));
    }


    //solution

    public static Boolean array6(int[] nums, int index) {

        if (index == nums.length) return false;
        return nums[index] == 6 ? true : array6(nums, index + 1);

    }
}
