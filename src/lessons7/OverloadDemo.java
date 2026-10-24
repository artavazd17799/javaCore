package lessons7;

public class OverloadDemo {
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

    //Перегружаемый метод, проверяющий наличие
    //одного целочисленных параметров
    void test(int a) {
        System.out.println("a: " + a);
    }

    // Перегружаемый метод, проверяющий наличие
// двух целочисленных параметров
    void test(int a, int b) {
        System.out.println(" a  i b: " + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие
    //параметра типа douЫe
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}
     class Overload{
         public static void main(String[] args) {
             OverloadDemo ob = new OverloadDemo();
             double result;
             // вызвать все варианты метода test()
             ob.test ();
             ob.test(10);
             ob.test(10, 20);
             result = ob.test(123.25);
             System.out.println(
                     "Результат вызова ob.test(123.25): " + result);
         }

     }
//Применить автоматическое преобразование типов к перегрузке
class OverloadDemo1{
    void test (){
        System.out.println("Пapaмeтpы отсутствуют");
    }
    //Перегружаемый метод, проверяющий наличие
    // двух целочисленных параметров
    void test (int a, int b){
        System.out.println("a i b: " + a + " " +b);
    }
    // Перегружаемый метод, проверяющий наличие
    //параметра типа douЫe
    void test(double a) {
        System.out.println("Bнyтpeннee преобразование при вызове "
                +  " test(douЬle) а:" + a);
    }
}
class Overload1 {
    public static void main(String[] args) {
        //
        OverloadDemo1 ob = new OverloadDemo1();
        int i = 88;

        ob.test();
        ob.test(10,20);
        ob.test(i);
        ob.test(123.2);
    }
}


