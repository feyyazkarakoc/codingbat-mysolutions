package Map1;

import java.util.HashMap;
import java.util.Map;

public class MapAB4 {

    public static void main(String[] args) {

        System.out.println(mapAB4(new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake"))));
        System.out.println(mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake"))));
        System.out.println(mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb"))));


    }



    // solution :
    public static Map<String, String> mapAB4(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b") && map.get("a").length() != map.get("b").length()) {
            map.put("c", map.get("a").length() > map.get("b").length() ? map.get("a") : map.get("b"));
        } else if (map.containsKey("a") && map.containsKey("b") && map.get("a").length() == map.get("b").length()) {
            map.put("a", "");
            map.put("b", "");
        }
        return map;
    }
}
