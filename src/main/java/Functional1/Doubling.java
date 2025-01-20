package Functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {

    public static void main(String[] args) {
        System.out.println(doubling(new ArrayList<>(List.of(1, 2, 3))));
        System.out.println(doubling(new ArrayList<>(List.of(6, 8, 6, 8, -1))));
        System.out.println(doubling(new ArrayList<>()));

    }


    // solution 1 :
    public static List<Integer> doubling(List<Integer> nums) {

        return nums.stream()
                .map(t -> t + t)
                .collect(Collectors.toList());
    }


    // solution 2 :
    /*public static List<Integer> doubling(List<Integer> nums) {

        nums.replaceAll(t -> t  t);
        return nums;
    }*/






    /*public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(t -> t + t)
                .collect(Collectors.toList());
    }*/


   /* public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(t -> t + t);
        return nums;
    }*/

}

