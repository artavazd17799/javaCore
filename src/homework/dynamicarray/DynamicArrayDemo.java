package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        da.add(5);
        da.add(12);
        da.add(8);
        da.add(20);
        da.add(15);
        da.add(34);

        System.out.println("Զանգվածի տարրերը. " );
        da.print();
        // --- Թեստ 2 — Զանգվածի մեծացում --
        System.out.println("n== Թեստ 2 - Զանգվածի մեծացում");
        DynamicArray da2 = new DynamicArray();
        for (int i = 1; i <= 15; i++) {
            da2.add(i*5);
        }
        System.out.println("Տպել բոլոր 15 թվերը: ");
        da2.print();
        //  Թեստ 3 — Կրկնակի մեծացում
        System.out.print("\n=== Թեստ 3 — Կրկնակի մեծացում ===");
        DynamicArray da3 = new DynamicArray();
            da3.add(i * 2);
        }
        System.out.println("getByIndex(0) = " + da3.getByIndex(0));
        System.out.println("getByIndex(27) = " + da3.getByIndex(27));

        // --- Թեստ 4 — Ինդեքսով ստանալ էլեմենտ (getByIndex) ---
        System.out.println("\n Թեստ 4 — Ինդեքսով ստանալ էլեմենտ ");
        DynamicArray da4 = new DynamicArray();
        da4.add(10);
        da4.add(20);
        da4.add(30);

        System.out.println("Առաջին էլեմենտը (index 0): " + da4.getByIndex(0));
        System.out.println("Վերջին էլեմենտը (index 2): " + da4.getByIndex(2));
        System.out.println("Բացասական ինդեքս (-1): " + da4.getByIndex(-1));
        System.out.println("Գոյություն չունեցող ինդեքս (5): " + da4.getByIndex(5));

        DynamicArray emptyArray = new DynamicArray();
        System.out.println("Դատարկ զանգվածի դեպքում getByIndex(0): " + emptyArray.getByIndex(0));

        }
    }

