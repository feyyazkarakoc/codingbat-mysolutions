package Map1;

import java.util.HashMap;
import java.util.Map;

public class MapAB2 {

    public static void main(String[] args) {

        System.out.println(mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"))));
        System.out.println(mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb"))));
        System.out.println(mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa"))));

    }


    // solution
    public static Map<String, String> mapAB2(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {

            map.remove("a");
            map.remove("b");
        }

        return map;
    }
}
