package org.launchcode;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I will calculate the area of a rectangle.\nWhat is the length of the rectangle? (Whole numbers and decimal numbers only.)");
        double length = input.nextDouble();

        System.out.println("What is the width of the rectangle? (Whole numbers and decimal numbers only.)");
        double width = input.nextDouble();

        double area;
        area = width * length;

        System.out.println("The area of the rectangle is " + area + " units of whatever metric you provided. Didn't ask.");

    }
}
