package Recursion1;

public class Array11 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,11};
        int[] arr2 = {11,11};
        int[] arr3 = {1,2,3,4};

        System.out.println(array11(arr1,0));
        System.out.println(array11(arr2,0));
        System.out.println(array11(arr3,0));
    }


    //solution

    public static int array11(int[] nums, int index) {

        if (index == nums.length) return 0;
        return (nums[index] == 11 ? 1 : 0) + array11(nums, index + 1);

    }
}
