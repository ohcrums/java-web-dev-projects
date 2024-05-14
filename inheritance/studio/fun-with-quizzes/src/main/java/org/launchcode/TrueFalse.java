package org.launchcode;

public class TrueFalse extends Question {
    private boolean correctAnswer;

    public TrueFalse(String questionText, boolean correctAnswer) {
        super(questionText, null);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void showOptions() {
        System.out.println("Is the above statement 'true' or 'false':");
    }

    @Override
    public boolean checkAnswer(String response) {
        return Boolean.parseBoolean(response.trim().toLowerCase()) == correctAnswer;
    }
}
