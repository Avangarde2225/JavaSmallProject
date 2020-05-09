package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
    public static void main(String[] args) {
        Map<Integer, String> fruitMap = new HashMap<>();
        fruitMap.put(1, "banana");
        fruitMap.put(2, "orange");
        fruitMap.put(3, "pear");
        fruitMap.put(4,"apple");
        entrySetMap(fruitMap);

    }
    private static void entrySetMap(Map<Integer,String> fruitMap){
    for(Map.Entry<Integer, String> entry: fruitMap.entrySet()){
        System.out.println("Key is " + entry.getKey());
        System.out.println("Value is " + entry.getValue());
    }
    }
}
