package main;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoice extends Question {
    private String correctAnswer;
    private List<String> answerChoices;

    //constructor
    public MultipleChoice (String question, String correctAnswer, List<String> answerChoices) {
        super(question);
        this.correctAnswer = correctAnswer;
        this.answerChoices = answerChoices;
    }

    //setter
    public void setAnswerChoices(List<String> answerChoices) {
        this.answerChoices = answerChoices;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    //getter
    public List<String> getAnswerChoices() {
        return answerChoices;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    //methods
    public String displayAnswerChoicesList(){
        String choices = "";
        for(int i = 0; i<answerChoices.size(); i++){
            choices += (i+1) + ". " + answerChoices.get(i) + "\n" ;
        }
        return choices;
    }

    public Boolean checkForCorrectAnswer (String input) {
        if((answerChoices.contains(input) && this.getCorrectAnswer() == input)){
            return true;
        } else if(answerChoices.get(Integer.parseInt(input)) == this.correctAnswer){
            return true;
        } else {
            return false;
        }
    }

}
