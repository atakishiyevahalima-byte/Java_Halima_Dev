package Regex;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        if (word.matches("[A-Za-z]+")){
            System.out.println("It is word");
        } else{
            System.out.println("It is not word");
        }
    }
}
