package org.launchcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // getString method uses a regular string
        // HashMap<Character, Integer> textMap = mapBuilder(getString());

        // fileReader method uses Scanner to read a .txt file and return it as a string
        HashMap<Character, Integer> textMap = mapBuilder(fileReader());

        for  (Map.Entry<Character, Integer> charKey : textMap.entrySet()) {
            System.out.println(charKey.getKey() + ": " + charKey.getValue());
        }

    }

    private static String getString() {
        String ogText = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        return ogText.toLowerCase().replaceAll("[^a-z]", "");
    }

    private static String fileReader() throws FileNotFoundException {
        File textFile = new File("control-flow-and-collections/studio/counting-characters/src/main/resources/source-text.txt");
        Scanner sc = new Scanner(textFile);
        sc.useDelimiter("\\Z");
        return sc.next().toLowerCase().replaceAll("[^a-z]", "");
    }

    private static HashMap<Character, Integer> mapBuilder(String inText) {
        HashMap<Character, Integer> textMap = new HashMap<Character, Integer>();
        char[] textArr = inText.toCharArray();

        for (char c : textArr) {
            // check if char is key in map
            Integer charCheck = textMap.get(c);
            if (charCheck == null) {
                // if key not present, add key with value 1
                textMap.put(c, 1);
            } else {
                // if key is present, set a var to the key value, increment, and update value
                Integer charCount = textMap.get(c);
                charCount ++;
                textMap.put(c, charCount);
            }
        }
        return textMap;
    }
}