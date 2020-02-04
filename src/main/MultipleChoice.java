package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultipleChoice extends Question {
    private String correctAnswer;
    private List<String> answerChoices;

    //constructor
    public MultipleChoice (String question, String correctAnswer, List<String> answerChoices) {
        super(question);
        this.correctAnswer = correctAnswer;
        this.answerChoices = answerChoices;
        answerChoices.add(correctAnswer);
        Collections.shuffle(answerChoices);
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
        choices += "Please enter number of choice:";
        return choices;
    }

    public Boolean checkForCorrectAnswer (String input) {
        Boolean correct = false;
        if(correctAnswer.toLowerCase().equals(input.toLowerCase())){
            correct = true;
        } else if (isInteger(input)) {
            if(answerChoices.get(Integer.parseInt(input)-1) == this.correctAnswer){
                correct = true;
            }
            
        }
        return correct;
    }

}
