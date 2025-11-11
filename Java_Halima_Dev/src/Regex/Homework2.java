package Regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("I learn in 6th grade, I 11 years old, my sister 13 years old");
       while (matcher.find()){
           System.out.println("Hайдено: " + matcher.group());
       }
    }
}
