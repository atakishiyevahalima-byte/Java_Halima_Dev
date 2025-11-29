package Maps;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Double> grades = new HashMap<>();
        grades.put("Leyla", 100.0);
        grades.put("Aylin", 90.7);
        grades.put("Selin", 57.9);
        grades.put("Mehri", 67.8);
        System.out.println(grades);

        TreeMap<String, Integer> balance = new TreeMap<>();
        balance.put("Maryam", 500);
        balance.put("Murad", 100);
        balance.put("Narmina", 48);
        balance.put("Leyla", 97);
        System.out.println(balance);

        SortedMap<Integer, String> phone_number = new TreeMap<>();
        phone_number.put(5, "+994558908900");
        phone_number.put(3, "+994558986544");
        phone_number.put(2, "+994507588835");
        phone_number.put(4, "+994508695763");
        phone_number.put(1, "+994718498849");
        System.out.println(phone_number);
    }
}
