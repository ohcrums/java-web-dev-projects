package org.launchcode;

public class QuizRunner {
    public static void main(String[] args){

        // TODO: call Quiz methods to run the test
        MultipleChoice testQuestion = new MultipleChoice ("i am a question", new String[]{"correct answer", "incorrect"}, 0);

        testQuestion.showQuestion();
        testQuestion.showOptions();
        System.out.println(testQuestion.checkAnswer("1"));


        // TODO: create questions

        // TODO: present questions to the user

        // TODO: accept and store user responses

        // TODO: grade test and print results

    }
}
