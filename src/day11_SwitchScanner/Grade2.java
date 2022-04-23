package day11_SwitchScanner;

public class Grade2 {

    public static void main(String[] args) {

        /*
        if the grade is A or B or C or D ==> Passed
        otherwise ==> Failed
         */

        char ch = 'G';
        String result = "";
        switch (ch){

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
            default:
                result = "Invalid";

        }
        System.out.println(result);





    }
}
