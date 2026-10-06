package homework;

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
        for( int i =1; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];

            }
        }
        System.out.println("Minimum number" + min);
    }




}






