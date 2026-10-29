package Sets;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> programs = new LinkedHashSet<>();
        programs.add("Java");
        programs.add("Python");
        programs.add("C++");
        programs.add("Java");
        System.out.println(programs);
        // Порядок вывода: Java, Python, C++ повторно Java не показывается
    }
}
