package Sets;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(20);
        numbers.add(1);
        numbers.add(50);
        numbers.add(3);
        numbers.add(3);
        System.out.println(numbers);
    }
}
