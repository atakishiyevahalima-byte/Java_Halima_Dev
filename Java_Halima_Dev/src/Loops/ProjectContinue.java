package Loops;

public class ProjectContinue {
    public static void main(String[] args) {
        for (int x = 1; x < 20; x++){
            if (x % 4 == 0) continue;
            System.out.println("x: " + x);
        }

        for (int y = 0; y < 15; y++){
            if (y == 10) break;
            System.out.println("y: " + y);
        }

    }
}
