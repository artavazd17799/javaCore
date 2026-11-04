package lesson9;

public class B extends A {
    public int j;

    @Override
    public void callMe() {
        System.out.println("hi from B");

    }

    public void callMeForB() {
        System.out.println("callMeForB");
    }
}
