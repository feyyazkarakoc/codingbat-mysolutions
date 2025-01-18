package Map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllSwap {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(allSwap(new String[]{"ab", "ac"})));
        System.out.println(Arrays.toString(allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
        System.out.println(Arrays.toString(allSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})));

    }


    // solution 1 :
    public static String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String firstLetter = strings[i].substring(0, 1);
            Integer index = map.get(firstLetter);
            if (index != null) {
                String temp = strings[i];
                strings[i] = strings[index];
                strings[index] = temp;
                map.remove(firstLetter);
            } else {
                map.put(firstLetter, i);
            }
        }
        return strings;
    }






    // solution 2 :
    /*public static String[] allSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            Character firstChar = strings[i].charAt(0);
            if (map.containsKey(firstChar)) {
                int previousIndex = map.get(firstChar);
                String temp = strings[previousIndex];
                strings[previousIndex] = strings[i];
                strings[i] = temp;
                map.remove(firstChar);
            } else {
                map.put(firstChar, i);
            }
        }
        return strings;
    }*/






    /*public static String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {

            String firstLetter = strings[i].substring(0, 1);
            Integer index = map.get(firstLetter);
            if (index != null) {
                String temp = strings[index];
                strings[index] = strings[i];
                strings[i] = temp;
                map.remove(firstLetter);
            } else {
                map.put(firstLetter, i);
            }
        }
        return strings;
    }*/


}




