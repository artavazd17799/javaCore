package lessons5;

public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.print("Дo возврата.");

        if (t) return; //возврат в вызывающий код

        System.out.print(
                "Этот оператор выполняться не будет.");
    }
}
