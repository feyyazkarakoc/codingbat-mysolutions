package Map2;

import java.util.HashMap;
import java.util.Map;

public class WordCount {


    public static void main(String[] args) {

        System.out.println(wordCount(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordCount(new String[]{"c", "b", "a"}));
        System.out.println(wordCount(new String[]{"c", "c", "c", "c"}));

    }


    // solution 1 :
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        return map;
    }


    // solution 2 :
    /*public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, (map.get(str) == null ? 0 : map.get(str)) + 1);
        }

        return map;
    }*/


    // solution 3 :
   /* public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, map.containsKey(str) ? map.get(str) + 1 : 1);
        }

        return map;
    }*/


    //solution 4 :
    /*public static Map<String, Integer> wordCount(String[] strings) {
        return wordCountHelper(strings, 0, new HashMap<>());
    }

    public static Map<String, Integer> wordCountHelper(String[] strings, int index, Map<String, Integer> map) {

        if (index == strings.length) {
            return map;
        }

        String str = strings[index];
        map.put(str, map.getOrDefault(str, 0) + 1);
        return wordCountHelper(strings, index + 1, map);
    }*/


}
