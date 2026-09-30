package lessons3;

public class Conversion {
    public static void main(String[] args) {
       byte b;
       int i = 257;
       double d = 323.142;

        System.out.println("\nПреобазавание типа  int v tip byte. ");
        b = (byte)  i;
        System.out.println(" i and b " + i + " " +b );

        System.out.println(
                "\nprobrazavanie tipa double v tip int.");
        i = (int) d;
        System.out.println("d and i" + d + " " + i);

        System.out.println(
                "\nprobrazavanie tipa double v tip byte.");
        b = (byte) d;
        System.out.println("d and b " + d + " " +b );

    }
}
