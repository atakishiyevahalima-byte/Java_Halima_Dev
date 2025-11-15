package ExceptionHandling;

public class HomeworkCheckAge {
    static void checkAge(int age) throws Exception{
        if (age < 18){
            throw new Exception("Вам нет 18!");
        } else if (age >= 18){
            System.out.println("Добро пожаловать!");
        }
    }

    public static void main(String[] args) {
        try{
          checkAge(11);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
