package Logic2;

public class LuckySum {

    public static void main(String[] args) {

        System.out.println(luckySum(1, 2, 3));
        System.out.println(luckySum(1, 2, 13));
        System.out.println(luckySum(1, 13, 3));

    }


    //solution
    public static int luckySum(int a, int b, int c) {
        if (a == 13) return 0;
        if (b == 13) return a;
        if (c == 13) return a + b;
        return a + b + c;
    }



   /* public static int luckySum(int a, int b, int c) {
        int sum = 0;
        if (a != 13) {
            sum += a;
            if (b != 13) {
                sum += b;
                if (c != 13) {
                    sum += c;
                }
            }
        }
        return sum;
    }*/





   /* public static int luckySum(int a, int b, int c) {
        int[] nums = {a,b,c};
        int sum = 0;
        for(int num : nums){
            if(num==13){
                break;
            }
            sum += num;
        }
        return sum;
    }*/
}
