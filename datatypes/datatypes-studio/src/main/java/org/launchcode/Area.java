package org.launchcode;

import java.util.Scanner;

public class Area {
    // prompts user for the radius of a circle, calculate its area, print the result.
    // A = pi * r * r
    public static void main (String[] args) {
        double radius;

        Scanner input;
        input = new Scanner(System.in);

        System.out.println("I will calculate the area of a circle...\n" +
                "Enter the radius of a circle:");

        radius = input.nextDouble();
        input.close();

        double area = Circle.getArea(radius);

        System.out.println("The area of a circle whose radius is " + radius + ", is equal to " + area);
        System.out.println("""
                ***
                Disclaimer:
                Please note that this calculation uses Pi only to the hundredth decimal point, ignoring the following decimals :)""");
    }
}
