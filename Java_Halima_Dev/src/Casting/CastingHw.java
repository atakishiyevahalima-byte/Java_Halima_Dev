package Casting;

public class CastingHw {
    public static void main(String[] args) {
        // 1
        int a = 25;
        double b = a;
        System.out.println(b);
        // преобразование произошло автоматически, из-за того что это преобразование из меньшего в больший
        // и оно называется неявным

        //2
        double x = 7.9;
        int y = (int) x;
        System.out.println(y);
        // результат стал целым, потому что int принимает только целые значения

        //3
        byte c = 90;
        byte d = 60;
        // byte m = c + d; выдаёт ошибку, потому что в byte можно написать максимальное значение 127,  сумма
        // c и d  90 и 60 равна 150 и это превышает максимальное значение которое можно написать в byte
        int e = c + d;
        System.out.println(e);

        //4
        short s = 1000;
        byte t = (byte) s;
        System.out.println(t);
        // значение не равно 1000, потому что максимальное значение которое мы можем написать в byte это 127,
        // из-за этого программа превращает 1000 в десятичную ситему binary: 1111101000 и берёт последние 8 чисел:
        // 11101000  и превращает их в decimal: -24

        //5
        char ch = 'D';
        int w = ch;
        System.out.println(w);

        char g = 'A';
        int h = g;
        System.out.println(h);

        char z = 'Z';
        int u = z;
        System.out.println(u);

        char v = 'a';
        int i = v;
        System.out.println(i);

        char j = '0';
        int k = j;
        System.out.println(k);

        //6
        int n = 66;
        char m = (char) n;
        System.out.println(m);

        int l = 70;
        char o = (char) l;
        System.out.println(o);

        int p = 71;
        char q = (char) p;
        System.out.println(q);

        int r = 72;
        char p1 = (char) r;
        System.out.println(p1);

        int h1 = 97;
        char q1 = (char) h1;
        System.out.println(q1);

        int k1 = 98;
        char l1 = (char) k1;
        System.out.println(l1);

        //7
        String s1 = "456";
        int m1 = Integer.parseInt(s1) + 100;
        System.out.println(m1);
        // "456" отличается от 456, тем что "456" - это String, а 456 - это число

        //8
        int a1 = 5;
        int b1 = 2;
        double c1 = (double) a1/b1;
        System.out.println(c1);

        //9
        long big = 123456;
        short small = (short) big;
        System.out.println(small);
        // выводит странное число, потому что максимальное значение которое мы можем написать в short это 32767 ,
        // из-за этого программа превращает 123456 в десятичную ситему binary: 11110001001000000 и берёт последние
        // 8 чисел: 01000000 и превращает их в decimal

        //10
        String str = "99";
        double j1 = Integer.parseInt(str) * 1.5;
        int i1 = (int) j1;
        System.out.println("Дробное значение: " + j1);
        System.out.println("Целое значение: " + i1);

        char h2 = 'A';
        byte j2 = (byte) h2;
        System.out.println(j2);
    }

}
