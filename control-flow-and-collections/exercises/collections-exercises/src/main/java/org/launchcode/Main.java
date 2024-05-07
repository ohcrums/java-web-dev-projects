package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int entry : integerArray) {
            if (entry %2 != 0) {
                System.out.println(entry);
            }
        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));

        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(7, 14, 25, 3, 9, 11, 18, 22, 6, 29, 2, 13));
        int intSum = sumEven(integerArrayList);
        System.out.println("the sum of the ArrayList is: " + intSum);

        ArrayList<String> arrListWords = new ArrayList<>(Arrays.asList(words));
        System.out.println("five letter words: " + fiveLetter(arrListWords, 5) );

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length for which to search: ");
        int numChars = input.nextInt();
        input.close();

        System.out.println(numChars + " letter words: " + fiveLetter(arrListWords, numChars) );

    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static ArrayList<String> fiveLetter(ArrayList<String> arr, int searchLength) {
        ArrayList<String> matchingWords = new ArrayList<>();

        for (String arrWord : arr) {
            if (arrWord.length() == searchLength ) {
                matchingWords.add(arrWord);
            }
        }

        return matchingWords;

    }

}