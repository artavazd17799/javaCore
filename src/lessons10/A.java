package lessons10;

public class A {
    // это вложенный интерфейс
    public interface NestedIF{
        boolean isNotNegative(int x);
    }
}
// Класс В реализует вложенный интерфейс
class B implements A.NestedIF{
    public boolean isNotNegative(int x){
        return x < 0 ? false : true;
    }
}
class NestesIfDemo{
    public static void main(String[] args) {
        // использовать ссылку на вложенный интерфейс
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10))
            System.out.println("Чиcлo 10 неотрицательное");
        if (nif.isNotNegative(-12))
            System.out.println("Этo не будет выведено");
    }
}