package Loops;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println("");
        }

        boolean t = true;
        int a = 10;
        int b = 20;
        int c = 0;
        System.out.println("До возврата");
        if (a < b) {
            return ;
        }
        System.out.println(a + b);


    }
}
