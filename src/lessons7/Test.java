package lessons7;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }
    void meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }


    void meth(int a, int b) {
        a *= 2;
        b *= 2;
    }

    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}
class PassOb{
    public static void main(String[] args) {
        Test ob1 = new Test(100,22);
        Test ob2 = new Test(100,22);
        Test ob3 = new Test(-1,-1);

        System.out.println("ob1 == ob2: " + ob1.equals(ob1));
        System.out.println("ob1 == ob3: " + ob1.equals(ob3));
    }
}
//Аргументы примитивных типов передаются по значению
class Test1 {
    int a, b;

    Test1(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
}
class Test2 {
    int a;

    Test2 (int i){
        a = i;
    }
    Test2 incrByTen(){
        Test2 temp = new Test2(a +10);
        return temp;

    }
}
class RetOb{
    public static void main(String[] args) {
        Test2 ob1 = new Test2(2);
        Test2 ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("оb2.а после второго увеличения значения: "
                + ob2.a);
    }
}

