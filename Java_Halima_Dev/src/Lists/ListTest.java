package Lists;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> films = new ArrayList<>();
        films.add("Harry Potter");
        films.add("Avatar");
        films.add("Squid Game");
        films.add("Jumanji");
        films.add("Paddington");
        System.out.println(films);

        films.set(0, "Wednesday");
        System.out.println(films);
        System.out.println(films.get(2));
        films.remove(4);
        System.out.println(films);
    }
}
