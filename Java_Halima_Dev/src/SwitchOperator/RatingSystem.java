package SwitchOperator;

public class RatingSystem {
    public static void main(String[] args) {
        int grade = 5;
         switch (grade) {
             case 5:
                 System.out.println("Great");
                 break;
             case 4:
                 System.out.println("Good");
                 break;
             case 3:
                 System.out.println("Satisfactorily");
                 break;
             case 2:
                 System.out.println("Unsatisfactorily");
                 break;
             default:
                 System.out.println("Incorrect assessment");
         }
    }
}
