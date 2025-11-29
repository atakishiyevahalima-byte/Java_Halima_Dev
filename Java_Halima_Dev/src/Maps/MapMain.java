package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> personal_data = new HashMap<>();
        personal_data.put(12563562, "Halima");
        personal_data.put(1246762, "Khadija");
        personal_data.put(1236862, "Murad");

        System.out.println(personal_data);
        System.out.println(personal_data.get(12563562));

    }
}
