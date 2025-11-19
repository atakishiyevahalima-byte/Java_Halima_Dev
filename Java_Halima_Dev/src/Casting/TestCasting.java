package Casting;

public class TestCasting {
    public static void main(String[] args) {
        int x = 5;
        short y = (short) x;
        System.out.println(y);

        long a = 20;
        int b = (int) a;
        System.out.println(b);

        double c = 30;
        long d = (long) c;
        System.out.println(d);

        float e = 50.5f;
        byte f = (byte) e;
        System.out.println(f);

        System.out.println("======================================");
        int g = 27;
        double h = g;
        System.out.println(h);

        byte i = 95;
        long j = i;
        System.out.println(j);

        float k = 854.8f;
        double l = k;
        System.out.println(l);

        long m = 178;
        float n = m;
        System.out.println(n);
    }
}
