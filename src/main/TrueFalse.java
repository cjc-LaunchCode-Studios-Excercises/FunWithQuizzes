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
        return "Type True or False";
    }

    public Boolean isBoolean(String input) {
        try{
            Boolean.parseBoolean(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean checkForCorrectAnswer(String input){
        if(isBoolean(input)){
            return Boolean.parseBoolean(input) == this.correctAnswer;
        } else {
            return false;
        }
    }
}
