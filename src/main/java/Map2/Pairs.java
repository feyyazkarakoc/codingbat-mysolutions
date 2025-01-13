package Map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Pairs {

    public static void main(String[] args) {

        System.out.println(pairs(new String[]{"code", "bug"}));
        System.out.println(pairs(new String[]{"man", "moon", "main"}));
        System.out.println(pairs(new String[]{"man", "moon", "good", "night"}));
    }


    // solution 1 :
   /* public static Map<String, String> pairs(String[] strings) {

        Map<String, String> map = new HashMap<>();
        for (String str : strings) {
            map.put(str.substring(0, 1), str.substring(str.length() - 1));
        }

        return map;
    }*/


    // solution 2 :
   /* public static Map<String, String> pairs(String[] strings) {

        Map<String, String> map = new HashMap<>();
        Arrays.stream(strings)
                .forEach(s -> map.put(s.substring(0, 1)
                        , s.substring(s.length() - 1)));

        return map;
    }*/



    // solution 3 :
    public static Map<String, String> pairs(String[] strings) {
        return Arrays.stream(strings)
                .distinct()
                .collect(Collectors.toMap(s -> s.substring(0, 1), s -> s.substring(s.length() - 1)));
    }
}
