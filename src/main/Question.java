package main;

import java.util.ArrayList;

public class Question {
    private String question;
    private String answer;


    public Question (String question, String answer){
        this.question = question;
        this.answer = answer;
    }





    //getters
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }



    //setters
    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


}
