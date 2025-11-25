package Lists;

import java.util.ArrayList;
import java.util.List;

public class ListHw {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Baku");
        cities.add("Tokyo");
        cities.add("Moscow");
        cities.add("London");
        cities.add("Paris");
        cities.add("New-York");
        cities.remove(2);
        System.out.println(cities);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(27);
        numbers.add(34);
        numbers.add(48);
        numbers.add(50);
        numbers.set(1,100);
        System.out.println(numbers);

        List<String> names = new ArrayList<>();
        names.add("Halima");
        names.add("Halima");
        names.add("Khadija");
        names.add("Murad");
        names.add("Khadija");
        System.out.println(names.indexOf("Khadija"));
        System.out.println(names.lastIndexOf("Halima"));
    }
}
