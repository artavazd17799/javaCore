package homework;

import java.util.Stack;

public class BraceChecker {
    // Պահում ենք ստուգվող տեքստը
    private String text;

    // Կոնստրուկտոր՝ տեքստը ընդունելու համար
    public BraceChecker(String text) {
        this.text = text;
    }

    // Այստեղ գրվելու է ստուգման ամբողջ տրամաբանությունը
    public void check() {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }
             else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    System.out.println("Error Closed " + ch + " but opened at " + i);
                    return;
                }
                char last = stack.pop();
                if (ch == '}' && last != '{') {
                    System.out.println("Error opened " + last + "but closed " + ch + "at" + i);
                    return;
                }
                if (ch == ']' && last != '['){
                    System.out.println("Error opened " + last + "but closed " + ch + " at " + i);
                return;
            }
            if (ch == ')' && last != '(') {
                System.out.println("Error opened " + last + " bit closed" + ch + " at " + i);
                return;
             }
           }
         }
            if(!stack.isEmpty()){


        System.out.println("Error opened " + stack.peek() + " but not closed");
        } else {
          System.out.println("No errors");
    }
    }
    }
