package Lesson;

public class Main {
    public static void main(String[] args) {
        int a = 5 / 2;
        System.out.println(a);

        int b = 5+1;
        b = b+1;
        b += 1;
        b -= 1;
        b *= 1;
        b /= 1;
        b %= 1;

        System.out.println(b);

        int num = 100;
        num += 5;

        System.out.println(num);

//       int x = 10;
//        ++x;
//        System.out.println(x);

        int x = 5;
        System.out.println(x);

        int y = 5;
        y += 3;
        System.out.println(y);

        int z = 5;
        z -= 3;
        System.out.println(z);

        int c = 5;
         c *= 3;
        System.out.println(c);

        double d = 5;
        d /= 3;
        System.out.println(d);

        int e = 5;
        e %= 3;
        System.out.println(e);

        int[] nums = {99, 100, 200};
        System.out.println(nums[0] > 100);
        System.out.println(nums[1] >= 100);
        System.out.println(nums[2] == 100);
        boolean isGreater100 = nums[1] >= 100;
        System.out.println(isGreater100);
    }
}
