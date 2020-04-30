import java.util.HashMap;
import java.util.Map;

public class MapExe {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        map.put("Orange", 300);
        map.put("GrapeFruit", 400);
        map.put("Watermelon", 500);

        System.out.print(map.keySet());
        System.out.println();
        System.out.print(map.values());

        System.out.println("--------------------------");
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.print(entry.getKey() + " " );


        }
    }
}
