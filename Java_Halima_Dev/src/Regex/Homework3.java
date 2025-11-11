package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework3 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]+");
        Matcher matcher = pattern.matcher("I am from Azerbaijan, I am Halima, I learn Java");
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
