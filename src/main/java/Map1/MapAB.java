package Map1;

import java.util.HashMap;
import java.util.Map;

public class MapAB {

    public static void main(String[] args) {

        System.out.println(mapAB(new HashMap<>(Map.of("a", "Hi", "b", "There"))));
        System.out.println(mapAB(new HashMap<>(Map.of("a", "Hi"))));
        System.out.println(mapAB(new HashMap<>(Map.of("b", "There"))));

    }


    // solution 1 :
    public static Map<String, String> mapAB(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("a" + "b", map.get("a") + map.get("b"));
        }
        return map;
    }


    // solution 2 :
    /*public static Map<String, String> mapAB(Map<String, String> map) {

        if (map.get("a") != null && map.get("b") != null) {
            map.put("a" + "b", map.get("a") + map.get("b"));
        }
        return map;
    }*/
}
