package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        System.out.println(Divide(5, 2));
        System.out.println(Divide(5, 0));

        // Test out your CheckFileExtension() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        HashMap<String, Integer> studentGrades = new HashMap<>();

        System.out.println("Results::");
        for (Map.Entry<String, String> entry : studentFiles.entrySet()) {
            int grade = CheckFileExtension(entry.getValue());
            if (grade == -1) {
                System.out.println(entry.getKey() + " didn't submit a file... " + grade + ", " + entry.getKey() + ".");
            } else {
                System.out.println(entry.getKey() + " gets a " + grade + ".");
            }



            studentGrades.put(entry.getKey(), grade);
        }

        System.out.println(studentGrades);

    }

    public static double Divide(double x, double y)
    {
        if (y == 0) {
            try {
                throw new ArithmeticException("You may not divide by zero... ");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
            return -1;
        }
        return (double) x / y;
    }

    public static int CheckFileExtension(String fileName)
    {
        if (fileName == null || fileName.isEmpty()) {
            try {
                throw new IllegalArgumentException("That's not a file!");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
            return -1;
        }
        if (fileName.endsWith(".java")) {
            return 1;
        }
        return 0;
    }
}