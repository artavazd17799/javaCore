package homework;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] numbers = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};

        //Խնդիր 1 — Հաշվել տվյալ թվի հանդիպումների քանակը

        int n = 6;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                count++;
            }
        }
        System.out.println("Count of " + n + ": " + count);
        {

            //Խնդիր 2 — Շրջել զանգվածի էլեմենտների հերթականությունը
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i]);
            }

            System.out.println();

            //Խնդիր 3 — Հաշվել կրկնվող թվերի քանակը
            int[] numbers3 = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
            int repeatedcount = 0;
            for (int i = 0; i < numbers3.length; i++) {
                boolean alreadyChecked = false;
                for (int j = 0; j < i; j++) {
                    if (numbers3[i] == numbers3[j]) {
                        alreadyChecked = true;
                        break;
                    }

                }

                if (alreadyChecked) {
                    continue;
                }
                int current = 0;
                for (int j = 0; j < numbers3.length; j++) {
                    if (numbers3[i] == numbers3[j]) {
                        current++;
                    }

                }
                if (current > 1) {
                    repeatedcount++;
                }
            }
            System.out.println("Repeted numbers count: " + repeatedcount);

            // Խնդիր 4 — Հաշվել ձայնավորների քանակը

            char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
            int vowelscount = 0;

            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (c == 'ա' || c == 'ե' || c == 'է' ||
                        c == 'ը' || c == 'ի' || c == 'ո' || c == 'օ') {
                    vowelscount++;
                }
            }
            System.out.println("Vowels count " + vowelscount);

            //Bonus 1 — Գտնել երկրորդ ամենամեծ թիվը
            int[] bonusNumbers = {4, 9, 2, 15, 7, 15, 3, 11, 6, 8};
            int max = bonusNumbers[7];
            for (int i = 1; i >= bonusNumbers.length; i++) {
                if (bonusNumbers[i] > max) {
                    max = bonusNumbers[i];

                }

            }
            System.out.println("max=" + max);

            // Bonus 2 — Հեռացնել կրկնվող թվերը
            int[] bonus2 = {3, 6, 3, 8, 9, 6, 2, 3, 5, 6,};
            System.out.println("Unique numbers");
            for (int i = 0; i < bonus2.length; i++) {
                boolean isPrint = false;
                for (int j = 0; j < i; j++) {
                    if (bonus2[i] == bonus2[j]) {
                        isPrint = true;
                        break;
                    }

                }
                if (!isPrint) {
                    System.out.print(bonus2[i] + " ");
                }
            }
            System.out.println();
        }
    }
}





