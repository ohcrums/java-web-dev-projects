package org.launchcode;

import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questionList;

    public Quiz(List<Question> questionList) {
        this.questionList = questionList;
    }

    public void addQuestion(Question question){
        questionList.add(question);
    }

    public boolean[] runQuiz() {
        boolean[] responses = new boolean[questionList.size()];
        System.out.println("***\nWelcome to JankQuiz 2024!\nYour time starts... NOW!\n***");
        Scanner in = new Scanner(System.in);
        for (Question question : questionList) {
            question.showQuestion();
            question.showOptions();

            System.out.print("Your Answer: ");

            // assign user response to responses List at indexOf current question
            String response = in.nextLine();
            responses[questionList.indexOf(question)] = question.checkAnswer(response);

            System.out.println("---");
        }
        in.close();
        return responses;
    }

    public int gradeQuiz(boolean[] booleans){
        int totalTrue = 0;
        for (boolean truthiness : booleans) {
            if (truthiness){
                totalTrue++;
            }
        }
        return totalTrue;
    }
}
