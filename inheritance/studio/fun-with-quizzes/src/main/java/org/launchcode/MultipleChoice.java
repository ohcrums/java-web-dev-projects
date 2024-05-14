package org.launchcode;

// a fixed set of possible answers, of which only one may be chosen and only one answer is correct.
public class MultipleChoice extends Question{
    private String[] options;
    private int correctIndex;

    // constructor
    public MultipleChoice(String questionText, String[] options, int correctIndex) {
        super(questionText);
        this.options = options;
        this.correctIndex = correctIndex;
    }

    @Override
    public void showOptions() {
        // prints options as a numbered list, expect int as response
        for (int i =0; i < options.length; i++) {
            System.out.println((i + 1) + ": " + options[i]);
        }
    }

    @Override
    public boolean checkAnswer(String response) {
        int responseInt = Integer.parseInt(response) - 1;
        return (responseInt) == correctIndex;
    }
}
