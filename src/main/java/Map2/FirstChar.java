package Map2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {

    public static void main(String[] args) {

        System.out.println(firstChar(new String[]{"salt", "tea", "soda", "toast"}));
        System.out.println(firstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));
        System.out.println(firstChar(new String[]{}));

    }


    // solution :
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str : strings) {
            map.put(str.substring(0, 1), map.getOrDefault(str.substring(0, 1), "") + str);
        }
        return map;
    }


   /* public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str : strings) {
            String key = str.substring(0,1);
            map.put(key, map.getOrDefault(key, "") + str);
        }
        return map;
    }*/
}
