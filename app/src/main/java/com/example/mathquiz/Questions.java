package com.example.mathquiz;

import java.util.Random;

public class Questions {

    private int firstNumber;
    private int secondNumber;
    private int answer;

    private int [] answerArray;
    private int answerPosition;
    private int upperLimit;
    private String questionPhrase;





    public Questions(int upperLimit){
        this.upperLimit = upperLimit;
        Random randomNumber = new Random();

        this.firstNumber=randomNumber.nextInt(upperLimit);
        this.secondNumber=randomNumber.nextInt(upperLimit);
        this.answer=this.firstNumber + this.secondNumber;

        this.answerPosition = randomNumber.nextInt(2);
       this.answerArray = new int[]{0,1};
        this.answerArray[0] = randomNumber.nextInt(upperLimit);
       this.answerArray[1] = randomNumber.nextInt(upperLimit) ;
        questionPhrase = this.firstNumber + " + " + this.secondNumber + " = ";

        answerArray[answerPosition]= answer;

    }



    public int[] getAnswerArray() {
        return answerArray;
    }

    public void setAnswerArray(int[] answerArray) {
        this.answerArray = answerArray;
    }

    public int getAnswerPosition() {
        return answerPosition;
    }

    public void setAnswerPosition(int answerPosition) {
        this.answerPosition = answerPosition;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public String getQuestionPhrase() {
        return questionPhrase;
    }

    public void setQuestionPhrase(String questionPhrase) {
        this.questionPhrase = questionPhrase;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    //--

}
