package Map1;

import java.util.HashMap;
import java.util.Map;

public class Topping2 {

    public static void main(String[] args) {

        System.out.println(topping2(new HashMap<>(Map.of("ice cream", "cherry"))));
        System.out.println(topping2(new HashMap<>(Map.of("spinach", "dirt", "ice cream", "cherry"))));
        System.out.println(topping2(new HashMap<>(Map.of("yogurt", "salt"))));
    }


    // solution
    public static Map<String, String> topping2(Map<String, String> map) {

        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }

        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }

        return map;
    }
}
