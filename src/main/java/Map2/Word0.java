package Map2;


import java.util.HashMap;
import java.util.Map;


public class Word0 {

    public static void main(String[] args) {

        System.out.println(word0(new String[]{"a", "b", "a", "b"}));
        System.out.println(word0(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(word0(new String[]{"c", "b", "a"}));
    }


    // solution 1 :
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> wordMap = new HashMap<>();
        for (String str : strings) {
            wordMap.putIfAbsent(str, 0);
        }
        return wordMap;
    }


    // solution 2 :
   /* public static Map<String, Integer> word0(String[] strings) {

        return Arrays.stream(strings)
                .distinct()
                .collect(Collectors.toMap(str -> str, str -> 0));


    }*/


    // solution 3 :
   /*public static Map<String, Integer> word0(String[] strings) {

       Map<String, Integer> map = new HashMap<>();
       Arrays.asList(strings)
               .forEach(string -> map.put(string, 0));

       return map;
   }*/








    /*public static Map<String, Integer> word0(String[] strings) {

        Map<String, Integer> wordMap = new HashMap<>();
        for (String str : strings) {
            wordMap.put(str, 0);
        }

        return wordMap;
    }*/


    /*public static Map<String, Integer> word0(String[] strings) {

        Map<String, Integer> wordMap = new HashMap<>();
        for (String str : strings) {
            wordMap.putIfAbsent(str, wordMap.getOrDefault(str, 0));
        }
        return wordMap;
    }*/


   /* public static Map<String, Integer> word0(String[] strings) {

        return Arrays.stream(strings)
                .distinct()
                .collect(Collectors.toMap(str -> str, str -> 0));
    }*/


    /*public static Map<String, Integer> word0(String[] strings) {

        Map<String, Integer> map = new HashMap<>();
        Arrays.asList(strings)
                .forEach(string -> map.put(string, 0));
        return map;
    }*/


}
