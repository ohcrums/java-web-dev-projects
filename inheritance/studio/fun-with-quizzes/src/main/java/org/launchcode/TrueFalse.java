package org.launchcode;

public class TrueFalse extends Question {
    private boolean correctAnswer;

    public TrueFalse(String questionText, String[] options, boolean correctAnswer) {
        super(questionText, options);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean checkAnswer(String response) {
        return false;
    }


    // need override showOptions
}
