package StringMethods;

public class Test {
    public static void main(String[] args) {
        String s = "Java";
        System.out.println(s.length());
        String s0 = "Program";
        char[] symbols = s.toCharArray();
        System.out.println(symbols);
        String s1 = "Hello";
        String s2 = "HELLO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        String s3 = "Halima";
        System.out.println(s3.startsWith("H"));
        System.out.println(s3.endsWith("A"));
        String s4 = "I am programmist";
        System.out.println(s4.substring(0, 4));
        String s5 = "Programmists";
        System.out.println(s5.replace("m", "w"));
        String s6 = "Khadija";
        System.out.println(s6.indexOf("a"));
        System.out.println(s6.lastIndexOf("a"));
        String s7 = "Java";
        String s8 = "SQl";
        System.out.println(s7.regionMatches(4, s8, 0, 2));
        String s9 = "     C#   ";
        System.out.println(s9.trim());
        String s10 = "Java is programming";
        System.out.println(s10.toLowerCase());
        System.out.println(s10.toUpperCase());
    }
}
