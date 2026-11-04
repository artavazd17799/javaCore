package lessons8;
  public class A {
    int i,j;

    void showj(){
        System.out.println(" i & j: " + i + " " + j);
    }
}
class B extends A {
    int i;
    int k;
    void showk() {
        System.out.println("k : " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}
class SimpleInheritance{
    public static void main(String[] args) {
        A superOb =new A();
        B subOb =new B();
        // суперкласс может использоваться самостоятельно
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Coдepжимoe объекта superOb: ");
        superOb.showj();
        System.out.println();

        /* Подкласс имеет доступ ко всем открытым членам
         своего суперкласса. */
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Coдepжимoe объекта subOb: ");
        subOb.showj();
        subOb.showk();

        System.out.println();
        System.out.println("Cyммa i, j и k в объекте subOb");
        subOb.sum();
    }
}