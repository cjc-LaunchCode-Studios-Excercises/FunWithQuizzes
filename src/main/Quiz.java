package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private String name;
    private List<Question> questions = new ArrayList<>();

    //getters
    public String getName() {
        return name;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    //methods
    public void addQuestion(Question aNewQuestion){
        questions.add(aNewQuestion);
    }

    public String displayQuestions(){
        String questionsDisplayedOnScreen = "";
        for(Question question: questions){
            questionsDisplayedOnScreen += question.getQuestion() + "\n";
            questionsDisplayedOnScreen += question.displayAnswerChoicesList();
        }
        return questionsDisplayedOnScreen;
    }
    public String startQuiz() {
        Scanner input =new Scanner(System.in);
        Double correctAnswers = 0.0;
        for(Question question: questions) {
            question.displayQuestion();
            System.out.println(question.displayAnswerChoicesList());
            String answer = input.nextLine();
            if(question.checkForCorrectAnswer(answer)) {
                correctAnswers++;
            }
        }
        input.close();
        Double percentage = correctAnswers / questions.size() * 100;
        return "\n" + correctAnswers.intValue() + " answers correct out of " + questions.size() + "\nfor a percentage of " + Math.round(percentage) + "%.";
    }
}
