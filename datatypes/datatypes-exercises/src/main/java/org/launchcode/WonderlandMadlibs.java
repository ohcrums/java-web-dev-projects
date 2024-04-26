package org.launchcode;

import java.util.Scanner;

public class WonderlandMadlibs {
    public static void main(String[] args) {
        String wonderQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search term:");

        String searchTerm = input.nextLine();

        boolean searchResult = wonderQuote.toLowerCase().contains( searchTerm.toLowerCase() );

        int resultIndex = wonderQuote.indexOf(searchTerm);
        int searchLength = searchTerm.length();

        System.out.println("Your search term is " + searchLength + " characters long.");

        if (!searchResult) {
            System.out.println("Search term '" + searchTerm + "' not found :(");
        } else {
            System.out.println("Search term '" + searchTerm + "' was found :D" +
                    "\nIt first appears at character-index " + resultIndex + "." +
                    "\nWhat would you like to replace the word '" + searchTerm + "' with?");

            String newWord = input.nextLine().trim();
            String crazySentence = wonderQuote.replace(searchTerm, newWord);
            System.out.println(crazySentence + "\n---\nWasn't that fun? Don't answer.");
        }
        input.close();
    }
}
