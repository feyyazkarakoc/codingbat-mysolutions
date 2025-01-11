package Map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class WordLen {


    public static void main(String[] args) {

        System.out.println(wordLen(new String[]{"a", "bb", "a", "bb"}));
        System.out.println(wordLen(new String[]{"this", "and", "that", "and"}));
        System.out.println(wordLen(new String[]{"code", "code", "code", "bug"}));
    }


    // solution 1 :
    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, str.length());
        }

        return map;
    }


    // solution 2 :
   /* public static Map<String, Integer> wordLen(String[] strings) {

        return Arrays.stream(strings)
                .distinct()
                .collect(Collectors.toMap(string -> string, string -> string.length()));
    }*/


    // solution 3 :
    /*public static Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> map = new HashMap<>();
        Arrays.asList(strings)
                .forEach(string -> map.put(string, string.length()));
        return map;
    }*/


    // solution 4 :
   /* public static Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> map = new HashMap<>();
        for (String str : new HashSet<>(Arrays.asList(strings))) {
            map.put(str, str.length());
        }

        return map;
    }*/
}
