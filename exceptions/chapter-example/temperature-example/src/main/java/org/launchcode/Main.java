package org.launchcode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        double fahrenheit;
        Temperature currentTemp = new Temperature();
        System.out.println("current temperature: " + currentTemp.getFahrenheit());

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        currentTemp.setFahrenheit(fahrenheit);
        System.out.println("current temperature: " + currentTemp.getFahrenheit());
    }
}