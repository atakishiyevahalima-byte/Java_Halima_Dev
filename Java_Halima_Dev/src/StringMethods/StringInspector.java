package StringMethods;

import java.util.Scanner;

public class StringInspector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write text");
        String s0 = sc.nextLine();
        System.out.println(s0);
        System.out.println(s0.length());
        System.out.println(s0.toUpperCase());
        System.out.println(s0.toLowerCase());
        System.out.println("Write text with spaces");
        String s1 = sc.nextLine();
        System.out.println(s1.trim());
        char[] lettera = s0.toCharArray();
        System.out.println(lettera);
        System.out.println("Write numbers");
        String numbers = sc.nextLine();
        char[] nums = numbers.toCharArray();
        System.out.println(nums);
        System.out.println("Write text with spaces");
        String s2 = sc.nextLine();
        char[] spaces =  s2.toCharArray();
        System.out.println(spaces);
        System.out.println("Write text with letter 'a' ");
        String s3 = sc.nextLine();
        System.out.println(s3.indexOf("a"));
        System.out.println("Write text with letter 'l' ");
        String s4 = sc.nextLine();
        System.out.println(s4.lastIndexOf("l"));
        System.out.println("Write which symbol you want to change to which");
        System.out.println(s3.replace(sc.nextLine(), sc.nextLine()));
        System.out.println(s0.startsWith("H"));
        System.out.println(s0.endsWith("r"));
        System.out.println("Write indexes");
        System.out.println(s0.substring(sc.nextInt(), sc.nextInt()));
        System.out.println(s0.regionMatches(5, s2, 0, 4));
    }
}
