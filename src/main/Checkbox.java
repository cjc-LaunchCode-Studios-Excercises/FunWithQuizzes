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
        answerChoices.addAll(correctAnswers);
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
            choices += (i+1) + ". " + answerChoices.get(i) + "\n";
        }
        choices += "Please enter value of selections using commas without spaces, such as 3,5,7,8";
        return choices;
    }

    public Boolean checkForCorrectAnswer(String input){
        List<String> inputList = new ArrayList<>(Arrays.asList(input.split(",")));
        Integer inputListSize = inputList.size();
        Integer inputListCorrect = 0;
        if(inputListSize == correctAnswers.size()){
            for(String list : inputList){
                if(this.correctAnswers.contains(list)){
                    inputListCorrect++;
                } else if(isInteger(list)){
                    for(String answer : correctAnswers) {
                        if (answerChoices.get(Integer.parseInt(list) - 1).equals(answer)) {
                            inputListCorrect++;
                        }
                    }
                } else {
                    break;
                }
            }
        }

        return inputListCorrect == correctAnswers.size();
    }
}
