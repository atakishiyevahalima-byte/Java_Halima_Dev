package ClassesAndMethods;

public class Homework {
    public static void main(String[] args) {
        System.out.println("first exercise");
        for (int x = 1; x < 10; x++){
            System.out.println(x);
        }

        System.out.println("second exercise");
        int a = 8;
        int b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.println("third exercise");
        MethodHomework mh = new MethodHomework();
        mh.a = 5;
        mh.b = 37;
        mh.sum();

        System.out.println("fourth exercise");
        for (int x = 1; x < 10; x++){
            if (x == 5) break;
            System.out.println(x);
        }

        System.out.println("fifth exercise");
        for (int x = 1; x < 10; x++){
            if (x == 5) continue;
            System.out.println(x);
        }
    }
}
