import java.util.HashMap;

public class Map {
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
    }
}
