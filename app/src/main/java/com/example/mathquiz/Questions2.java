package com.example.mathquiz;

import java.util.ArrayList;
import java.util.List;

public class Questions2 {

    private List<Questions> questions;
    private int totalQuestions;

    private Questions currentQuestion;

    public Questions2(){
        totalQuestions=0;
      //  currentQuestion = new Questions(2);
        questions = new ArrayList<>();
    }

    public void makeNewQuestion(){
        currentQuestion = new Questions(10);
        totalQuestions++;
        questions.add(currentQuestion);
    }

    public boolean checkAnswer (int submittedAnswer){

        boolean isCorrect;
        if(currentQuestion.getAnswer() == submittedAnswer){
            isCorrect=true;
        } else {
            isCorrect=false;
        }
        return isCorrect;
    }



    public List<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public Questions getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(Questions currentQuestion) {
        this.currentQuestion = currentQuestion;
    }



}
