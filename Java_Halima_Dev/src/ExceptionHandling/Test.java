package ExceptionHandling;

public class Test {
    public static void main(String[] args) {
        int x = 20;
        int y = 5;
        try{
            System.out.println(x/y);
        } catch (Exception e) {
            if (y == 0){
                throw new ArithmeticException("На ноль делить нельзя!!!");
            }
        } finally {
            System.out.println("Always runs!");
        }


        try{
            String[] texts = {"HTML", "Java", "Css"};
            System.out.println(texts[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вне пределов массива!");
        } finally {
            System.out.println("Always runs!");
        }

        int a = 5;
        try{
            System.out.println(a);
        } catch (Exception e) {
            if (a < 0){
                throw new ArithmeticException("Negative");
            } else if (a >= 0) {
                System.out.println("Positive!");
            }
        } finally {
            System.out.println("Always runs!");
        }
    }
}
