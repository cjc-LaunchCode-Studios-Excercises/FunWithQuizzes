package main;

import java.util.ArrayList;

public class TrueFalse extends Question {
    private Boolean correctAnswer;


    public TrueFalse(String question, Boolean correctAnswer) {
        super(question);
        this.correctAnswer = correctAnswer;
    }

    //getters
    public Boolean getCorrectAnswer() {
        return correctAnswer;
    }

    //setters
    public void setCorrectAnswer(Boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    //methods
    public String displayAnswerChoicesList(){
        return "True\nFalse";
    }
    public Boolean checkForCorrectAnswer(String input){
        return Boolean.parseBoolean(input) == this.correctAnswer;
    }
}
