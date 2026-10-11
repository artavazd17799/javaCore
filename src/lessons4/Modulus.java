package lessons4;

public class Modulus {
    public static void main(String[] args) {
        int x = 42;
        double y = 42.25;

        System.out.println("x mod 10 =" + x % 10);
        System.out.println(" y  mod 10 =" + y % 10 );
    }

    public static class IncDec {
        public static void main(String[] args) {
         int a = 1;
         int b = 2;
         int c;
         int d;
          c = ++b;
          d = a++;
          c++;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
    }
    }
}
