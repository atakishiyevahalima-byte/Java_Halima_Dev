package Sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTestNull {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>();
        words.add(null);
        System.out.println(words);
    }
}
