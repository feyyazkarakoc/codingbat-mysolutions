package Map1;

import java.util.HashMap;
import java.util.Map;

public class MapShare {

    public static void main(String[] args) {

        System.out.println(mapShare(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "ccc"))));
        System.out.println(mapShare(new HashMap<>(Map.of("b", "xyz", "c", "ccc"))));
        System.out.println(mapShare(new HashMap<>(Map.of("a", "aaa", "c", "meh", "d", "hi"))));


    }


    // solution :
    public static Map<String, String> mapShare(Map<String, String> map) {

        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }


    /*public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.get("a") != null) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }*/
}
