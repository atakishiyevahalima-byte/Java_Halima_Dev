package Sets;

import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        Set<String> letters = new TreeSet<>();
        letters.add("A");
        letters.add("N");
        letters.add("L");
        letters.add("C");
        letters.add("W");
        letters.add("Z");
        System.out.println(letters);
    }
}
