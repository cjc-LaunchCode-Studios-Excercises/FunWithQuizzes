package main;

import java.util.ArrayList;

public  abstract class Question {
    private String question;
    public abstract String displayAnswerChoicesList();
    public abstract Boolean checkForCorrectAnswer(String input);
    public static Boolean isInteger(String input){
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //constructor
    public Question (String question){
        this.question = question;
    }

    //getters
    public String getQuestion() {
        return question;
    }

    //setters
    public void setQuestion(String question) {
        this.question = question;
    }


    //methods
    public void displayQuestion() {
        System.out.println(question);
    }

}
