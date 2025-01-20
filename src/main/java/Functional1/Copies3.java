package Functional1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {

    public static void main(String[] args) {

        System.out.println(copies3(Arrays.asList("a", "bb", "ccc")));
        System.out.println(copies3(Arrays.asList("24", "a", "")));
        System.out.println(copies3(Arrays.asList("hello", "there")));
    }


    // solution 1 :
    /*public static List<String> copies3(List<String> strings) {

        return strings.stream()
                .map(t -> t + t + t)
                .collect(Collectors.toList());
    }*/




    // solution 2 :
    public static List<String> copies3(List<String> strings) {

        strings.replaceAll(t -> t + t + t);
        return strings;
    }
}
