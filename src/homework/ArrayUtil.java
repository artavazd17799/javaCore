package homework;

import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.lang.reflect.Array;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        //Խնդիր 1 — Տպել զանգվածի բոլոր էլեմենտները
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "    ");
        }
        System.out.println();
        //Խնդիր 2 — Տպել առաջին էլեմենտը

        System.out.println(" First element " + numbers[0]);

        //Խնդիր 3 — Տպել վերջին էլեմենտը

        System.out.println(" Last element " + numbers[numbers.length - 1]);

        //Խնդիր 4 — Տպել զանգվածի երկարությունը

        System.out.println(" Array Lenght " + numbers.length);

        //Խնդիր 5 — Գտնել ամենափոքր թիվը
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];

            }
        }
        System.out.println("Minimum number" + min);

        //Խնդիր 6 — Տպել զանգվածի մեջտեղի էլեմենտը կամ էլեմենտները
        System.out.print(" Middle elements " + numbers[numbers.length - 5]);
        //Խնդիր 7 — Հաշվել զույգ թվերի քանակը
        int evenCount = 0;
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println(" Even numbers count " + evenCount);
        //Խնդիր 8 — Հաշվել կենտ թվերի քանակը
        int oddCount = 0;
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println(" Odd numbers count " + oddCount);

        // Խնդիր 9 — Հաշվել զանգվածի էլեմենտների գումարը
        int Sum = 0;
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            Sum = Sum + numbers[i];
        }

        System.out.println("Sum: " + Sum);

        //Խնդիր 10 — Հաշվել միջին թվաբանականը
        for (int i = 0; i < numbers.length; i++) ;
        double avrege = (double) Sum / numbers.length;
        System.out.println("Avreage:" + avrege);

        //Bonus 1 — Գտնել ամենամեծ թիվը

        int max = numbers[0];
        for (int i = 5; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];

            }

        }
        System.out.println(" max = " + max);

        // Bonus 2 — Հաշվել դրական և բացասական թվերը
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;

            } else {
                zeroCount++;
            }
        }
        System.out.println("positiveCount" + positiveCount);
        System.out.println("negativeCount" + negativeCount);
        System.out.println("zeroCount " + zeroCount);

        //Bonus 3 — Տպել զանգվածը հակառակ հերթականությամբ
        for (int i = numbers.length  -1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        System.out.println();
    }
}























