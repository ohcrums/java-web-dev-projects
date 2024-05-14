package org.launchcode;

import java.util.ArrayList;
import java.util.List;

public class QuizRunner {
    public static void main(String[] args){

        MultipleChoice multipleChoiceQ = new MultipleChoice("In what year did 'The Battle of Hastings Bridge' take place?", new String[]{"1944", "1666", "1815", "1066"}, 3);
        Checkbox checkboxQ = new Checkbox("Which of these are CPU architecture?", new String[]{"x86", "DDR4", "ARM64", "RJ45"}, new boolean[]{true, false, true, false});
        TrueFalse trueFalseQ = new TrueFalse("TypeScript is dynamically typed.", false);

        List<Question> theQuestions = new ArrayList<>();
        Quiz quiz = new Quiz(theQuestions);
        // could have added directly to List, but demonstrating Quiz addQuestion method
        quiz.addQuestion(multipleChoiceQ);
        quiz.addQuestion(checkboxQ);
        quiz.addQuestion(trueFalseQ);

        // run the quiz and store the returned array of individual question results
        boolean[] userResponses = quiz.runQuiz();
        // call quiz grader and store total correct answers as an int variable
        int totalCorrect = quiz.gradeQuiz(userResponses);
        // print results
        System.out.println("\n***\nResults:\nOf " + theQuestions.size() + " total questions, you answered " + totalCorrect + " correctly.\nThanks for playing JankQuiz!\n***");
    }
}
