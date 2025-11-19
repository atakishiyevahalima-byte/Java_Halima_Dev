package DateClasses;

import java.time.LocalDate;

public class LocalDateHomework {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2025, 10, 20);
        System.out.println(ld);
        System.out.println(ld.getDayOfYear());
        System.out.println(ld.plusDays(5));
        System.out.println(ld.plusWeeks(7));
        System.out.println(ld.plusMonths(3));
        System.out.println(ld.plusYears(10));
        System.out.println(ld.minusDays(2));
        System.out.println(ld.minusMonths(4));
        System.out.println(ld.minusWeeks(11));
        System.out.println(ld.minusYears(6));
    }
}
