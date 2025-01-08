package Map1;

import java.util.HashMap;
import java.util.Map;

public class MapBully {

    public static void main(String[] args) {

        System.out.println(mapBully(new HashMap<>(Map.of("a", "candy", "b", "dirt"))));
        System.out.println(mapBully(new HashMap<>(Map.of("a", "candy"))));
        System.out.println(mapBully(new HashMap<>(Map.of("a", "candy", "b", "carrot", "c", "meh"))));

    }


    // solution 1 :
    public static Map<String,String> mapBully(Map<String,String> map){

       if (map.containsKey("a")){
           map.put("b",map.get("a"));
           map.put("a","");
       }

       return map;
    }


    // solution 2 :
    /*public static Map<String, String> mapBully(Map<String, String> map) {

        if (map.get("a") != null) map.put("b", map.put("a", ""));
        return map;
    }*/



    /*public static Map<String, String> mapBully(Map<String, String> map) {

        if (map.containsKey("a")){
            map.put("b",map.get("a"));
            map.put("a","");
        }
        return map;
    }*/


   /* public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.get("a") != null) map.put("b", map.put("a", ""));
        return map;
    }*/
}
