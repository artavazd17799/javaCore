package homework;

public class ArraySortingHomework {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};
        //Խնդիր 1 — Սորտավորել զանգվածը փոքրից մեծ (Ascending Order){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(numbers));

        // Խնդիր 2 — Սորտավորել զանգվածը մեծից փոքր (Descending Order)
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(numbers));
    }
}