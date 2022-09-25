package repCharCount;

import java.util.Map;
import java.util.TreeMap;

public class RepCharCount {

    TreeMap<Character, Integer> stringToMap(String str) {
        TreeMap<Character, Integer> charCount = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (charCount.get(ch) == null) {
                charCount.put(ch, 1);
            } else {
                int tempValue = charCount.get(ch);
                charCount.replace(ch, tempValue + 1);
            }
        }
        return charCount;
    }

    String maxRepChar(TreeMap<Character, Integer> charCount){
            char ch = '0';
            int  count = 0;
        for(Map.Entry<Character, Integer> map: charCount.entrySet()){
            if (map.getValue() > count){
                ch = map.getKey();
                count = map.getValue();
            }
        }
        return (ch + " - " + count);
    }


}
