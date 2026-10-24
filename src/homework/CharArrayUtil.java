package homework;

public class CharArrayUtil {
    public static void main(String[] args) {

        char[] chars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };


        // Խնդիր 1 — Տպել բոլոր սիմվոլները

        System.out.print("Task 1: ");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();



        // Խնդիր 2 — Հաշվել սիմվոլների քանակը

        System.out.println("Characters count: " + chars.length);
        if (chars.length > 0) {
            System.out.println("First character: " + chars[0]);
            System.out.println("Last character: " + chars[chars.length - 1]);
        }



        // Խնդիր 3 — Հաշվել տրված սիմվոլի հանդիպումների քանակը

        char c = 'a';
        int countC = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                countC++;
            }
        }
        System.out.println("Character '" + c + "' count: " + countC);



        // Խնդիր 4 — Հաշվել ձայնավորների քանակը

        int vowelsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelsCount++;
            }
        }
        System.out.println("Vowels count: " + vowelsCount);


        // Խնդիր 5 — Հաշվել բաղաձայնների քանակը

        int consonantsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            // Ստուգում ենք՝ արդյոք անգլերեն տառ է, բայց ոչ ձայնավոր
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                    consonantsCount++;
                }
            }
        }
        System.out.println("Consonants count: " + consonantsCount);



        // Խնդիր 6 — Հաշվել բացատների քանակը

        int spacesCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                spacesCount++;
            }
        }
        System.out.println("Spaces count: " + spacesCount);



        // Խնդիր 7 — Շրջել սիմվոլների հերթականությունը (Reverse)

        // Քանի որ պահանջվում է փոխել զանգվածը, ստեղծում ենք պատճեն, որ մյուս խնդիրները չտուժեն
        char[] reversedChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversedChars[i] = chars[i];
        }

        for (int i = 0; i < reversedChars.length / 2; i++) {
            char temp = reversedChars[i];
            reversedChars[i] = reversedChars[reversedChars.length - 1 - i];
            reversedChars[reversedChars.length - 1 - i] = temp;
        }

        System.out.print("Reversed: ");
        for (int i = 0; i < reversedChars.length; i++) {
            System.out.print(reversedChars[i]);
        }
        System.out.println();



        // Խնդիր 8 — Փոխել մեծատառերը և փոքրատառերը

        // Մեծատառ դարձնելու համար
        char[] upperChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            upperChars[i] = chars[i];
            if (upperChars[i] >= 'a' && upperChars[i] <= 'z') {
                upperChars[i] = (char) (upperChars[i] - 32);
            }
        }

        System.out.print("Uppercase: ");
        for (int i = 0; i < upperChars.length; i++) {
            System.out.print(upperChars[i]);
        }
        System.out.println();

        // Փոքրատառ դարձնելու համար
        char[] lowerChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            lowerChars[i] = chars[i];
            if (lowerChars[i] >= 'A' && lowerChars[i] <= 'Z') {
                lowerChars[i] = (char) (lowerChars[i] + 32);
            }
        }

        System.out.print("Lowercase: ");
        for (int i = 0; i < lowerChars.length; i++) {
            System.out.print(lowerChars[i]);
        }
        System.out.println();
        //Խնդիր 9 — Փոխարինել տրված սիմվոլը
        char oldChar = 'a';
        char newChar = '*';
        char[] replacedChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            replacedChars[i]= chars[i];
            if(replacedChars[i] == oldChar){
                replacedChars[i] = newChar;
            }

        }
        System.out.println("Replaced string");
        for (int i = 0; i < replacedChars.length; i++) {
            System.out.print(replacedChars[i]);

        }
        System.out.println();
        //Խնդիր 10 — Ստուգել Palindrome-ը
        char[] palindromeChars = {'l','e','v','e','l'};

        boolean isPalimdrome = true;
        int length = palindromeChars.length;

        for (int i = 0; i < length /2 ; i++) {
            if(palindromeChars[i] != palindromeChars[length -1 -i]) {
                isPalimdrome = false;
                break;
            }

        }
        System.out.println(" Is palidrome " + isPalimdrome);
        //Bonus 1 — Գտնել սիմվոլի առաջին հանդիպման ինդեքսը
        char[] b1Chars ={'a','b','c','d'};
        char target = 'a';
        int firstIndex = -1;
        for (int i = 0; i < b1Chars.length; i++) {
            if (b1Chars[i]  == target) {
                firstIndex = i;
                break;

            }

        }
        System.out.println("Bouns 1 \nFirst index " + firstIndex);
        //Bonus 2 — Համեմատել երկու char զանգված
        char[] first = {'J','a','v','a'};
        char[]second = {'J','a','v','a'};
        boolean areEqual = true;

        if (first.length != second.length) {
            areEqual = false;
        }else {
            for (int i = 0; i < first.length; i++) {
                if (first[i] != second[i]) {
                    areEqual = false;
                    break;
                }
            }

        }
        System.out.println("Bonus 2 \nArrays are equal " + areEqual);
        //Bonus 3 — Հեռացնել կրկնվող սիմվոլները
        char[] b3Chars = {'a','b','a','c','b','d','a'};
        System.out.println("Bonus 3: \n");
        for (int i = 0; i < b3Chars.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if ( b3Chars[i] == b3Chars[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(b3Chars[i] + " ");

            }

        }
        System.out.println();
    }
}





