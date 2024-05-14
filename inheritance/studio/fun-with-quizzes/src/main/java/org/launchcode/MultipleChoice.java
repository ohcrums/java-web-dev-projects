package org.launchcode;

public class MultipleChoice extends Question{
    private int correctIndex;

    public MultipleChoice(String questionText, String[] options, int correctIndex) {
        super(questionText, options);
        this.correctIndex = correctIndex;
    }

    @Override
    public boolean checkAnswer(String response) {
        int responseInt = Integer.parseInt(response) - 1;
        return (responseInt) == correctIndex;
    }
}
