package Functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Math1 {

    public static void main(String[] args) {

        System.out.println(math1(new ArrayList<>(Arrays.asList(1, 2, 3))));
        System.out.println(math1(new ArrayList<>(Arrays.asList(6, 8, 6, 8, 1))));
        System.out.println(math1(new ArrayList<>(Arrays.asList(10))));


    }



    // solution :
    public static List<Integer> math1(List<Integer> nums) {

        return nums.stream()
                .map(t -> (t + 1) * 10)
                .collect(Collectors.toList());
    }

}
