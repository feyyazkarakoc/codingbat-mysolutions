package Functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {

    public static void main(String[] args) {

        System.out.println(square(new ArrayList<>(Arrays.asList(1, 2, 3))));
        System.out.println(square(new ArrayList<>(Arrays.asList(6, 8, -6, -8, 1))));
        System.out.println(square(new ArrayList<>(Arrays.asList())));

    }




    // solution 1 :
    public static List<Integer> square(List<Integer> nums) {

        return nums.stream()
                .map(t -> t * t)
                .collect(Collectors.toList());
    }



    // solution 2 :
   /*public static List<Integer> square(List<Integer> nums) {
        nums.replaceAll(t -> t * t);
        return nums;
    }*/


    /*public static List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(t -> t * t)
                .collect(Collectors.toList());
    }*/





    /*public static List<Integer> square(List<Integer> nums) {
        nums.replaceAll(t -> t * t);
        return nums;
    }*/



}
