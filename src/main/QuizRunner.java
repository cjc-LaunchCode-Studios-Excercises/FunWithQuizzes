package main;

import java.util.ArrayList;
import java.util.List;

public class QuizRunner {
    public static void main(String[] args) {
        List<String> answerChoices = new ArrayList<>();
        answerChoices.add("Baseball");
        answerChoices.add("Basketball");
        answerChoices.add("Volleyball");
        answerChoices.add("Football");
        MultipleChoice question1 = new MultipleChoice("What sport did I play in college?", "Basketball", answerChoices);

        TrueFalse question2 = new TrueFalse("I played college basketball.", true);

        Quiz quiz = new Quiz();
        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        System.out.println(quiz.displayQuestions());

    }
}
