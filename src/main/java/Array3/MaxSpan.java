package Array3;

import java.util.HashMap;
import java.util.Map;

public class MaxSpan {

    public static void main(String[] args) {

        System.out.println(maxSpan(new int[]{1, 2, 1, 1, 3}));
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));

    }


    // solution 1:
    public static int maxSpan(int[] nums) {

        int maxSpan = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = nums.length - 1; j >= i; j--) {

                if (nums[i] == nums[j]) {

                    maxSpan = Math.max(maxSpan, j - i + 1);
                    break;

                }


            }

        }

        return maxSpan;
    }


    // solution 2 :
   /*  public static int maxSpan(int[] nums){

         Map<Integer,Integer> firstIndexMap = new HashMap<>();
         int maxSpan = 0;

         for (int i = 0; i < nums.length ; i++) {

             firstIndexMap.putIfAbsent(nums[i],i);

             maxSpan= Math.max(maxSpan,i-firstIndexMap.get(nums[i])+1);

         }

         return maxSpan;
     }*/








    // solution 3 :
   /* public static int maxSpan(int[] nums){

        Map<Integer,Integer> map = new HashMap<>();
        int firstIndex =0;
        int lastIndex =0;
        int maxSpan = 0;

        for (int num: nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry:map.entrySet()){

            if (entry.getValue() >1){

                for (int i = 0; i < nums.length  ; i++) {

                    if (nums[i]==entry.getKey()){
                        firstIndex = i;
                        break;
                    }
                }

                for (int j = nums.length-1; j >=0 ; j--) {

                    if (nums[j]==entry.getKey()){
                        lastIndex=j;
                        break;
                    }

                }


            }

            maxSpan = Math.max(maxSpan,lastIndex-firstIndex+1);
        }

        return maxSpan;

    }*/





  /*  public static int maxSpan(int[] nums) {

        int maxSpan = 0;
        int firstIndex = 0;
        int lastIndex = 0;

        for (int num : nums) {

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == num) {

                    firstIndex = i;
                    break;
                }
            }

            for (int j = nums.length - 1; j >= 0; j--) {

                if (nums[j] == num) {

                    lastIndex = j;
                    break;
                }

            }

            maxSpan = Math.max(maxSpan, lastIndex - firstIndex + 1);
        }

        return maxSpan;

    }*/


   /* public static int maxSpan(int[] nums) {

        int maxSpan = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = nums.length - 1; j >= i; j--) {

                if (nums[i] == nums[j]) {

                    maxSpan = Math.max(maxSpan, j - i + 1);
                }

            }

        }
        return maxSpan;
    }*/


   /* public static int maxSpan(int[] nums) {

        Map<Integer, Integer> firstIndexMap = new HashMap<>();
        int maxSpan = 0;

        for (int i = 0; i < nums.length; i++) {

            firstIndexMap.putIfAbsent(nums[i], i);

            maxSpan = Math.max(maxSpan, i - firstIndexMap.get(nums[i]) + 1);
        }

        return maxSpan;
    }*/


}
