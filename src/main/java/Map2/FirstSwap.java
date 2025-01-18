package Map2;

import java.util.*;

public class FirstSwap {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(firstSwap(new String[]{"ab", "ac"})));
        System.out.println(Arrays.toString(firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
        System.out.println(Arrays.toString(firstSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})));
    }


    // solution 1 :
    public static String[] firstSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            Character firstChar = strings[i].charAt(0);
            if (map.containsKey(firstChar) && map.get(firstChar) == null) {
                continue;
            }
            if (map.containsKey(firstChar)) {
                int previousIndex = map.get(firstChar);
                String temp = strings[i];
                strings[i] = strings[previousIndex];
                strings[previousIndex] = temp;
                map.put(firstChar, null);

            } else {
                map.put(firstChar, i);

            }
        }
        return strings;
    }







    // solution 2 :
    /*public static String[] firstSwap(String[] strings) {

        Map<Character, Integer> map = new HashMap<>();
        Set<Character> disabled = new HashSet<>();

        for (int i = 0; i < strings.length; i++) {
            Character firstChar = strings[i].charAt(0);

            if (map.containsKey(firstChar) && !disabled.contains(firstChar)) {

                int previousIndex = map.get(firstChar);
                String temp = strings[i];
                strings[i] = strings[previousIndex];
                strings[previousIndex] = temp;
                disabled.add(firstChar);

            } else {
                map.put(firstChar, i);

            }
        }
        return strings;
    }*/








    // solution 3 :
   /* public static String[] firstSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            Character firstChar = strings[i].charAt(0);
            if (!map.containsKey(firstChar)) {
                map.put(firstChar, i);
                continue;
            }

            int previousIndex = map.get(firstChar);
            if (previousIndex != -1) {
                String temp = strings[i];
                strings[i] = strings[previousIndex];
                strings[previousIndex] = temp;
                map.put(firstChar, -1);
            }
        }
        return strings;
    }*/


}
