package main;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private String name;
    private List<Question> questions = new ArrayList<>();



    //getters
    public String getName() {
        return name;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    //methods
    public void addQuestion(Question aNewQuestion){
        questions.add(aNewQuestion);
    }

    public String displayQuestions(){
        String questionsDisplayedOnScreen = "";
        for(Question question: questions){
            questionsDisplayedOnScreen += question.getQuestion() + "\n";
            questionsDisplayedOnScreen += question.displayAnswerChoicesList();
        }
        return questionsDisplayedOnScreen;
    }
}
