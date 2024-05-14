package org.launchcode;

public class QuizRunner {
    public static void main(String[] args){

        // TODO: call Quiz methods to run the test
        MultipleChoice testMultiple = new MultipleChoice ("i am a question", new String[]{"correct answer", "incorrect"}, 0);
        Checkbox testCheckbox = new Checkbox("i am a question", new String[]{"trueQ, falseQ"}, new boolean[]{true, false});

        System.out.println("MultipleChoice Test\n***");
        testMultiple.showQuestion();
        testMultiple.showOptions();
        System.out.println(testMultiple.checkAnswer("1"));

        System.out.println("Checkbox Test\n***");
        testCheckbox.showQuestion();
        testCheckbox.showOptions();
        System.out.println(testCheckbox.checkAnswer("false true"));
        System.out.println(testCheckbox.checkAnswer("true false"));
        System.out.println(testCheckbox.checkAnswer("true    false"));
        System.out.println(testCheckbox.checkAnswer(" true false"));


        // TODO: create questions

        // TODO: present questions to the user

        // TODO: accept and store user responses

        // TODO: grade test and print results

    }
}
