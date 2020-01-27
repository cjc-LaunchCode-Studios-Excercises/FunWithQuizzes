package main;

import java.util.ArrayList;

public class MultipleChoice extends Question {

    ArrayList<String> answerChoices;



    public MultipleChoice (String question, String answer, ArrayList<String> answerChoices) {
        super(question, answer);
        this.answerChoices = answerChoices;
    }

    public String displayAnswerChoicesArrayList(){
        String choices = "";
        for(int i = 0; i<answerChoices.size(); i++){
            choices += "\n" + (i+1) + ". " + answerChoices.get(i);
        }
        return choices;
    }




}
