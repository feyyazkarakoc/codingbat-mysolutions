package Functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {


    public static void main(String[] args) {

        System.out.println(rightDigit(new ArrayList<>(List.of(1, 22, 93))));
        System.out.println(rightDigit(new ArrayList<>(List.of(16, 8, 886, 8, 1))));
        System.out.println(rightDigit(new ArrayList<>(List.of(10, 0))));

    }


    public static List<Integer> rightDigit(List<Integer> nums) {

        return nums.stream()
                .map(t -> t % 10)
                .collect(Collectors.toList());
    }

}
