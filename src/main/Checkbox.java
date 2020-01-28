package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Checkbox extends Question {
    private List<String> correctAnswers;
    private List<String> answerChoices;


    public Checkbox (String question, List<String> correctAnswers, List<String> answerChoices) {
        super(question);
        this.correctAnswers = correctAnswers;
        this.answerChoices = answerChoices;
    }

    //getters
    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public List<String> getAnswerChoices() {
        return answerChoices;
    }

    //setters
    public void setCorrectAnswers(List<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public void setAnswerChoices(List<String> answerChoices) {
        this.answerChoices = answerChoices;
    }

    //methods
    public String displayAnswerChoicesList(){
        String choices = "";
        for(int i = 0; i<answerChoices.size(); i++){
            choices += "\n" + (i+1) + ". " + answerChoices.get(i);
        }

        return choices;
    }
//need to change input from string to Array list to integers within Array List
    public Boolean checkForCorrectAnswer(String input){
        List<String> inputList = new ArrayList<>();
        inputList.addAll(Arrays.asList(input.split(",")));
        Integer inputListSize = inputList.size();
        Integer inputListCorrect = 0;
        for(String list : inputList){
            if(this.correctAnswers.contains(list)){
                inputListCorrect++;
            } else {
                break;
            }
        }

        return inputListCorrect == correctAnswers.size();
    }


}
