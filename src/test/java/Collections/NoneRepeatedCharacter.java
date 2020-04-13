package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class NoneRepeatedCharacter {
    public static void main(String[] args) {
    char c = getFirstNoneRepeatedChar("aabbccdef");
        System.out.println("First none repeated char is " + c);
    }

    public static char getFirstNoneRepeatedChar(String str){
        Map<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();
        for(char ch: str.toCharArray()){
            countMap.put(ch,countMap.containsKey(ch) ? countMap.get(ch) + 1 : 1);
        }
        for(Map.Entry<Character, Integer> entry : countMap.entrySet()){
        if(entry.getValue() == 1){
            return entry.getKey();
        }
        }
        throw new RuntimeException("Did not find any other non repeated char");
    }
}
