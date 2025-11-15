package ExceptionHandling;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        try{
            System.out.println(a/b);
        } catch (Exception e) {
            if (b == 0){
                throw new ArithmeticException("На ноль делить нельзя!!!");
            }
        } finally {
            System.out.println("Работа завершена");
        }


        Scanner sc = new Scanner(System.in);
        try{
            int[] nums = {7, 9, 11, 13};
            System.out.println("Write index");
            System.out.println(nums[sc.nextInt()]);
        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException("Такого индекса не существует!");
        }

        try{
            System.out.println(20/0);
            String[] programs = {"JAVA", "HTML", "CSS"};
            System.out.println(programs[5]);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!!!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вне пределов массива!!!");
        } finally {
            System.out.println("Обработка завершена");
        }
    }
}
