package day13_StringClass;

import java.util.Locale;

public class StringMethod {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(3);
        System.out.println("thirdChar = " + thirdChar);

        //char tenthChar = word.charAt(9); // out of range for string "Cydeo"
        //System.out.println("tenthChar = " + tenthChar);

        System.out.println("---------------------------");

        String s1 = "Batch 25 is the best batch";
        int totalChar = s1.length();
        System.out.println("totalChar = " + totalChar);

        char lastChar = s1.charAt(s1.length() - 1); //last index number
        System.out.println("lastChar = " + lastChar);

        System.out.println("--------------------------------------");

        String str = "wooden spoon"; //we must assign it back to use again
        str = str.toUpperCase(); // "WOODEN SPOON"

        System.out.println("str = " + str);

        String sentence = "Today is a great day to learn java programming language";
        sentence = sentence.toUpperCase();

        System.out.println("sentence = " + sentence);
    }
}
