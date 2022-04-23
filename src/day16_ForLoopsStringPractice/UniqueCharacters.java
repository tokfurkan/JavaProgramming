package day16_ForLoopsStringPractice;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabccc";

        String result = "";

        for (int i = 0; i < str.length(); i++){ //i: index number of str (starting from 0)
            char ch = str.charAt(i);
            System.out.println(ch);
            if (str.indexOf(ch) == str.lastIndexOf(ch)){ //if the first and last index numbers of the character are same, then the character is unique.
                result += ch;
        }

        }





    }
}
