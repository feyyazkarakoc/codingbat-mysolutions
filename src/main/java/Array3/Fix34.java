package Array3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fix34 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(fix34(new int[]{1, 3, 1, 4})));
        System.out.println(Arrays.toString(fix34(new int[]{1, 3, 1, 4, 4, 3, 1})));
        System.out.println(Arrays.toString(fix34(new int[]{3, 2, 2, 4})));

    }


    // solution 1 :
    public static int[] fix34(int[] nums) {

        int len = nums.length;
        int index4 = 0;

        for (int i = 0; i < len; i++) {

            if (nums[i] == 3) {

                while (index4 < len && (nums[index4] != 4 || (index4 > 0 && nums[index4 - 1] == 3))) {
                    index4++;
                }

                if (index4 < len) {

                    int temp = nums[i + 1];
                    nums[i + 1] = nums[index4];
                    nums[index4] = temp;


                }

            }
        }

        return nums;
    }





    // solution 2:
   /* public static int[] fix34(int[] nums) {

        int[] pos4 = new int[nums.length];
        int pos4index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 4) {
                pos4[pos4index++] = i;

            }

        }

        int index4 = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 3) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[pos4[index4]];
                nums[pos4[index4++]] = temp;
                i++;
            }

        }
        return nums;
    }*/



    // solution 3 (non-best practice solution):
   /* public static int[] fix34(int[] nums) {

        int len = nums.length;

        int[] newArr = new int[len];

        for (int i = 0; i < len; i++) {
            if (nums[i] == 3) {
                newArr[i] = nums[i];
                newArr[i + 1] = 4;
                i++;
            }
        }

        for (int num : nums) {

            if (num != 3 && num != 4) {

                for (int j = 0; j < len; j++) {

                    if (newArr[j] != 3 && newArr[j] != 4) {
                        newArr[j] = num;
                    }
                }

            }

        }

        return newArr;
    }*/




    // solution 4:
    /*public static int[] fix34(int[] nums) {

        int len = nums.length;
        int index4 = 0;

        for (int i = 0; i < len - 1; i++) {

            if (nums[i] == 3 && nums[i + 1] != 4) {

                while (nums[index4] != 4 || (index4 > 0 && nums[index4 - 1] == 3)) {
                    index4++;
                }


                int temp = nums[i + 1];
                nums[i + 1] = nums[index4];
                nums[index4] = temp;


            }
        }

        return nums;
    }*/








    /*public static int[] fix34(int[] nums) {

        int len = nums.length;
        int index4 = 0;

        for (int i = 0; i < len; i++) {

            if (nums[i] == 3) {

                while (nums[index4] != 4) {
                    index4++;
                }


                int tempt = nums[i + 1];
                nums[i + 1] = nums[index4];
                nums[index4] = tempt;
            }

        }

        return nums;
    }*/


}
