package StringMethods;

import java.util.Locale;
import java.util.Scanner;

public class StringMethodsP2 {
    public static void main(String[] args) {
        String s0 = "123";
        System.out.println(s0.toString());
        System.out.println("==============================");
        String s1 = "Java";
        char[] letters = s1.toCharArray();
        System.out.println(letters[2]);
        System.out.println("==============================");
        String s2 = "World";
        String s3 = "HelloWorld";
        System.out.println(s2.regionMatches(5, s3, 0, 5));
        System.out.println("==============================");
        String s4 = "Hello";
        String s5 = "World";
        System.out.println(s3.concat(s2));
        System.out.println("==============================");
//        Scanner scanner = new Scanner(System.in);
//        String s6 = scanner.nextLine();
//        System.out.println(s6.trim());
//        scanner.close();
        System.out.println("==============================");
        int num = 100;
        String s7 = String.valueOf(num);
        System.out.println(s7 + 7);
        System.out.println("==============================");
        String s8 = "Java";
        System.out.println(s8.toLowerCase());
        System.out.println(s8.toUpperCase());
        System.out.println("==============================");
        String result = String.join(", ", "Java", "Python", "C#");
        System.out.println(result);
    }
}
