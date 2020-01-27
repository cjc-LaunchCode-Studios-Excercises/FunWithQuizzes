package main;

import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {

        ArrayList<String> listOfChoices = new ArrayList<>();
        listOfChoices.add("Basketball");
        listOfChoices.add("Baseball");
        listOfChoices.add("Volleyball");
        listOfChoices.add("Football");
        MultipleChoice question1 = new MultipleChoice("What sport did I play in college?","Basketball", listOfChoices);
        System.out.println(question1.getAnswer());
        System.out.println(question1.answerChoices);
        System.out.println(question1.displayAnswerChoicesArrayList());

        Question question2 = new Question("What sport did I play?", "Basketball");
        System.out.println(question2.getQuestion());
    }
}
