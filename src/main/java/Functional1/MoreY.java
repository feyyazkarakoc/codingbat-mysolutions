package Functional1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoreY {

    public static void main(String[] args) {

        System.out.println(moreY(new ArrayList<>(Arrays.asList("a", "b", "c"))));
        System.out.println(moreY(new ArrayList<>(Arrays.asList("hello", "there"))));
        System.out.println(moreY(new ArrayList<>(Arrays.asList("yay"))));
    }


    // solution 1 :
    public static List<String> moreY(List<String> strings){
        return strings.stream()
                .map(t -> "y" + t + "y")
                .collect(Collectors.toList());
    }


    // solution 2 :
    /*public static List<String> moreY(List<String> strings) {
        strings.replaceAll(t -> "y" + t + "y");
        return strings;
    }*/



}
