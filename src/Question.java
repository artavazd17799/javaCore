import java.util.Random;

class Question implements SharedConstants{
    Random rand = new Random();
    int ask(){
        int prob = (int) (100 * rand.nextDouble());
       if (prob <  30)
            return NO;
        else if (prob< 60 )
            return YES;
        else if (prob  < 75)
            return LATER;
        else if (prob  <  98)
           return SOON;
           else
               return NEVER;
        }

    }
class AksMe implements SharedConstants {
    static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("Heт");
                break;
            case YES:
                System.out.println("Дa");
                break;
            case MAYBE:
                System.out.println("Boзмoжнo");
                break;
            case LATER:
                System.out.println("Пoзднee");
                break;
            case SOON:
                System.out.println("Bcкope");
                break;
            case NEVER:
                System.out.println("Hикoгдa");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}