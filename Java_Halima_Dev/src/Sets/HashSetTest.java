package Sets;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(10);
        numbers.add(7);
        System.out.println(numbers);
        // повтор не показывается

    }
}
