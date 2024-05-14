package org.launchcode;

public abstract class Question {
    private String questionText;

    // constructor
    public Question(String questionText){
        this.questionText = questionText;
    }

    // setters and getters
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    // concrete methods
    // print question
    public void showQuestion() {
        System.out.println(getQuestionText());
    }

    // abstract methods
    public abstract void showOptions();
    public abstract boolean checkAnswer(String answer);


}
