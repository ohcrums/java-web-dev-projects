package org.launchcode;

public abstract class Question {
    private String questionText;
    private String[] options;

    // constructor
    public Question(String questionText, String[] options) {
        this.questionText = questionText;
        this.options = options;
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

    public void showOptions() {
        // prints options as a numbered list, expect int as response
        for (int i =0; i < options.length; i++) {
            System.out.println((i + 1) + ": " + options[i]);
        }
    }

    // abstract method
    public abstract boolean checkAnswer(String response);


}
