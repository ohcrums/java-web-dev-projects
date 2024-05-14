package org.launchcode;

public class Checkbox extends Question{
    private boolean[] correctOptions;

    public Checkbox(String questionText, String[] options, boolean[] correctOptions) {
        super(questionText, options);
        this.correctOptions = correctOptions;
    }

    @Override
    public boolean checkAnswer(String response) {
        String[] responseStringArr = response.split(" ");
        boolean[] choiceBooleans = new boolean[responseStringArr.length];

        if (responseStringArr.length != correctOptions.length) {
            return false;
        }

        for (int i = 0; i < responseStringArr.length; i++) {
            // convert strings to booleans
            choiceBooleans[i] = responseStringArr[i].equals("true");


            if (correctOptions[i] != choiceBooleans[i]) {
                return false;
            }
        }
        return true;
    }
}
