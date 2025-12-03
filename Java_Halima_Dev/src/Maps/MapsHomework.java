package Maps;

import java.util.*;

public class MapsHomework {
    public static void main(String[] args) {
        //1
        HashMap<String, Integer> age = new HashMap<>();
        age.put("Leyla", 11);
        age.put("Zahra", 15);
        age.put("Aylin", 26);
        age.put("Gunel", 45);
        age.put("Gunay", 41);
        age.put("Ulviya", 40);
        age.put("Aylin", 39);
        System.out.println(age);

        //2
        Map<Integer, String> topic = new LinkedHashMap<>();
        topic.put(1, "Java entrance");
        topic.put(2, "First program in Java");
        topic.put(3, "Variables");
        topic.put(4, "Arrays");
        topic.put(5, "Math Operators");
        System.out.println(topic);

        //3
        TreeMap<Integer, String> games = new TreeMap<>();
        games.put(3, "Minecraft");
        games.put(10, "Brawl Stars");
        games.put(4, "Roblox");
        games.put(9, "Genshin Impact");
        games.put(2, "Standoff");
        games.put(5, "Vehicle Masters");
        games.put(8, "Rider");
        games.put(7, "Block Blast");
        games.put(1, "Kitchen fever");
        System.out.println(games);

        //5
        NavigableMap<Integer, Integer> numbers = new TreeMap<>();
        numbers.put(10, 1);
        numbers.put(20, 2);
        numbers.put(30, 3);
        numbers.put(40, 4);
        numbers.put(50, 5);
        System.out.println(numbers.lowerKey(25));
        System.out.println(numbers.higherKey(25));
        System.out.println(numbers.floorKey(30));
        System.out.println(numbers.ceilingKey(30));
    }
}
