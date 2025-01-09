package Map1;

import java.util.HashMap;
import java.util.Map;

public class Topping1 {

    public static void main(String[] args) {

        System.out.println(topping1(new HashMap<>(Map.of("ice cream", "peanuts"))));
        System.out.println(topping1(new HashMap<>(Map.of("bread", "butter"))));
        System.out.println(topping1(new HashMap<>(Map.of("pancake", "syrup"))));

    }



    // solution
    public static Map<String, String> topping1(Map<String, String> map) {

        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }


}
