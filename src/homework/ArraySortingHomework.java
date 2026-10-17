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

        //Զրոների տեղափոխումը վերջ (Move Zeros to End)
        int[] arr = {0, 8, 0, 3, 12, 0, 7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 0 && arr[i] != 0 && j < i) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }


        }
        System.out.println(java.util.Arrays.toString(arr));
        //Զանգվածի շրջումը հակառակ հերթականությամբ (Reverse Array)
        int[] arr2 = {1, 2, 3, 4, 5};
        for (int i = arr2.length -1; i  >= 0; i--) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}