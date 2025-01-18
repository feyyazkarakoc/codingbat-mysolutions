package Map2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordAppend {

    public static void main(String[] args) {

        System.out.println(wordAppend(new String[]{"a", "b", "a"}));
        System.out.println(wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(wordAppend(new String[]{"a", "", "a"}));
    }



    // solution 1 :
    public static String wordAppend(String[] strings) {

        StringBuilder result = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, map.getOrDefault(string, 0) + 1);
            if (map.get(string) % 2 == 0) result.append(string);
        }
        return result.toString();
    }





    // solution 2 :

    /*public static String wordAppend(String[] strings) {

        StringBuilder result = new StringBuilder();
        List<String> seen = new ArrayList<>();

        for (String string : strings) {
            if (seen.contains(string)) {
                result.append(string);
                seen.remove(string);
            } else {
                seen.add(string);
            }
        }

        return result.toString();
    }*/
}
