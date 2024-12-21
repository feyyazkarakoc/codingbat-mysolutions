package Array3;

import java.util.Arrays;

public class Fix45 {



    public static void main(String[] args) {

        System.out.println(Arrays.toString(fix34(new int[]{1, 3, 1, 4})));
        System.out.println(Arrays.toString(fix34(new int[]{1, 3, 1, 4, 4, 3, 1})));
        System.out.println(Arrays.toString(fix34(new int[]{3, 2, 2, 4})));

    }


    // solution 1 :
    public static int[] fix34(int[] nums) {

        int index5 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                // Bulunacak bir sonraki kullanılabilir 5
                while (nums[index5] != 5 || (index5 > 0 && nums[index5 - 1] == 4)) {
                    index5++;
                }

                // 4'ün hemen sonrasındaki eleman ile uygun 5'in yerini değiştir
                int temp = nums[i + 1];
                nums[i + 1] = nums[index5];
                nums[index5] = temp;
            }
        }

        return nums;
    }


}
