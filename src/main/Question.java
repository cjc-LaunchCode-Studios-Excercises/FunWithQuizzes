package main;

import java.util.ArrayList;

public  abstract class Question {
    private String question;
    public abstract String displayAnswerChoicesList();
    public abstract Boolean checkForCorrectAnswer(String input);



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

}
