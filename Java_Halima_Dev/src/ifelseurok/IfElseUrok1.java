package ifelseurok;

public class IfElseUrok1 {
    public static void main(String[] args) {
        boolean isRaining = true;

        if (isRaining) {
            System.out.println("Идёт дождь");
        } else {
            System.out.println("Нет дождя");
        }

        int age = 18;
        if (age >= 18) {
            System.out.println("Accepted");
        } else{
            System.out.println("Rejected");
        }

        int x = 0;
        if (x > 0) {
            System.out.println("+");
        } else if (x < 0){
            System.out.println("-");
        } else {
            System.out.println("0");
        }

        int a = 0;

        if (a == 0){
            System.out.println("0");
        } else if (a % 2 == 0) {
           System.out.println("even");
        } else if(a % 2 != 0){
           System.out.println("odd");
       }


    }
}
