package Array2;

public class More14 {


    public static void main(String[] args) {

        int[] num1 = {1, 4, 1};
        int[] num2 = {1, 4, 1, 4};
        int[] num3 = {1, 1};
        System.out.println(more14(num1));
        System.out.println(more14(num2));
        System.out.println(more14(num3));
    }



    //solution
    public static boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int n : nums) {
            if (n == 1) {
                count1++;
            }

            if (n == 4) {
                count4++;
            }
        }
        return count1 > count4;

    }


}
