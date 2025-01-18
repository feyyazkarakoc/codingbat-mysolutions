package Map2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    public static void main(String[] args) {

        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordMultiple(new String[]{"c", "b", "a"}));
        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));


    }



    // solution :
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, !(map.get(string) == null));
        }
        return map;
    }



}
