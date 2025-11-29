package Sets;

import java.util.*;

public class SetHw {
    public static void main(String[] args) {
        // 1st
        HashSet<String> countries = new HashSet<>();
        countries.add("Azerbaijan");
        countries.add("China");
        countries.add("Germany");
        countries.add("Switzerland");
        countries.add("Japan");
        countries.add("Britain");
        countries.add("France");
        countries.add("Azerbaijan");
        countries.add("Switzerland");
        System.out.println(countries);
        // 2nd
        Set<String> names = new LinkedHashSet<>();
        names.add("Leyla");
        names.add("Maryam");
        names.add("Selin");
        names.add("Mehri");
        System.out.println(names);
        names.remove("Selin");
        System.out.println(names);
        // 3rd
        TreeSet<Double> grades = new TreeSet<>();
        grades.add(50.8);
        grades.add(85.0);
        grades.add(31.6);
        grades.add(96.5);
        grades.add(68.9);
        grades.add(57.0);
        grades.add(43.6);
        grades.add(50.8);
        grades.add(68.9);
        grades.add(31.6);
        System.out.println(grades);
        // 4th
        NavigableSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);
        System.out.println(numbers.higher(8));
        System.out.println(numbers.lower(120));
        System.out.println(numbers.floor(48));
        System.out.println(numbers.ceiling(56));
    }
}
