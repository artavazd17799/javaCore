package homework;

public class classBoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b = " + b);
        b = true;
        System.out.println("b = " + b);

        if(b) System.out.println("code running.");
        b = false;
        if(b) System.out.println("code running");

        System.out.println("10>9 = "+ (10>9));
    }
}
