package org.launchcode;

public abstract class Question {
    private String questionText;

    public Question(String questionText){
        this.questionText = questionText;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void showQuestion() {
        System.out.println(getQuestionText());
    }

    public abstract void showOptions();
    public abstract boolean checkAnswer(String answer);


}
