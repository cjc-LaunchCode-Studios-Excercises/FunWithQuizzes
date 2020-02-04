package main;

import java.util.ArrayList;
import java.util.List;

public class QuizRunner {
    public static void main(String[] args) {
        List<String> answerChoices = new ArrayList<>();
        answerChoices.add("Baseball");
        answerChoices.add("Volleyball");
        answerChoices.add("Football");
        MultipleChoice question1 = new MultipleChoice("What sport did I play in college?", "Basketball", answerChoices);

        TrueFalse question2 = new TrueFalse("I played college basketball.", true);

        List<String> question3AnswerChoices = new ArrayList<>();
        question3AnswerChoices.add("Python");

        List<String> question3Answers = new ArrayList<>();
        question3Answers.add("Java");
        question3Answers.add("Javascript");
        question3Answers.add("HTML");

        Checkbox question3 = new Checkbox("What have we learned about in this class?", question3Answers, question3AnswerChoices);

        Quiz quiz = new Quiz();
        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        quiz.addQuestion(question3);

        System.out.println(quiz.startQuiz());

    }
}
