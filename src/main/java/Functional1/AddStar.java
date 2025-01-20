package Functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddStar {

    public static void main(String[] args) {

        System.out.println(addStar(new ArrayList<>(List.of("a", "bb", "ccc"))));
        System.out.println(addStar(new ArrayList<>(List.of("hello", "there"))));
        System.out.println(addStar(new ArrayList<>(List.of("*"))));
    }





    // solution 1 :
    public static List<String> addStar(List<String> strings){
        return strings.stream()
                .map(t -> t + "*")
                .collect(Collectors.toList());
    }





    // solution 2 :
    /*public static List<String> addStar(List<String> strings){

        strings.replaceAll(t -> t + "*");
        return strings;

    }*/
}
