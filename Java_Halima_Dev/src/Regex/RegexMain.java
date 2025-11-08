package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {
    // \\d - любое число
    // "А.." - буква А и любые 2 символа
    // "hello|hi" - либо hello либо hi

    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("Java"); // создаёт шаблон
        Matcher matcher1 = pattern1.matcher("I know Java very well"); //ищет в тексте
        boolean found = matcher1.find();//ищет совпадение

        System.out.println("Есть ли совпадение? : " + found);

        boolean isWord = Pattern.matches("Python", "Python is Python");
        System.out.println(isWord);


        String[] texts = {"HelloWorld12", "Hi Guys", "Java_Is_easy00", "testJAVA2025"};

        for (String t : texts){
            boolean result = t.matches("[A-Za-z0-9]+");
            System.out.println(t + " - " + result);
        }


    }
}