package enum_.enum5;

/**
 * Created by USER on 05.06.2014.
 */
public class AskMe {
    static void answer(Answers result) {
        switch(result) {
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("Never");
                break;
        }
    }

    public static void main(String[] args) {
        Question question = new Question();
        Answers answers1 = question.ask();
        Answers answers2 = question.ask();
        Answers answers3 = question.ask();
        Answers answers4 = question.ask();
        System.out.println(answers1);
        System.out.println(answers2);
        System.out.println(answers3);
        System.out.println(answers4);
        System.out.println();
        answer(answers1);
        answer(answers2);
        answer(answers3);
        answer(answers4);  char f;
    }
}
