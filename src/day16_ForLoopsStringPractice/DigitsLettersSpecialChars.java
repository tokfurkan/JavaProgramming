package day16_ForLoopsStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School!@#$%WoodenSpoon";

        String digits = ""; //12345
        String letters = ""; //CydeoWoodenSpoon
        String specialChars = ""; //!@#$%

        for (int i = 0; i < str.length(); i++) { //i: index number of str

            char ch = str.charAt(i); //ch: each character that we have in str

            if (ch >= '0' && ch <= '9'){ //if the character is between '0' to '9'
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){ //if the character is letter
                letters += ch;
            } else { //if the character is neither digit nor letter, then it is special character
                specialChars += ch;
            }

        }

        System.out.println("specialChars = " + specialChars);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);



    }
}
