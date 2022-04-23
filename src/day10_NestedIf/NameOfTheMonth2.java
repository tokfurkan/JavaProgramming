package day10_NestedIf;

public class NameOfTheMonth2 {

    public static void main(String[] args) {

        int number = 5;
        String result = "";

        if (number == 1){
            result = "January";
        } else if (number == 2){
            result = "February";
        } else if (number == 3){
            result = "March";
        } else if (number == 4){
            result = "April";
        } else if (number == 5){
            result = "May";
        } else if (number == 6){
            result = "June";
        } else if (number == 7){
            result = "July";
        } else if (number == 8){
            result = "August";
        } else if (number == 9){
            result = "September";
        } else if (number == 10){
            result = "October";
        } else if (number == 11){
            result = "November";
        } else {
            result = "December";
        }

        System.out.println("----------------------------------");

        int num = 9;

        String result1 = (num == 1)? "January" : (num == 2) ? "February" : (num == 3) ? "March"
                : (num == 4) ? "April" : (num == 5) ? "May" : (num == 6) ? "June"
                : (num == 7) ? "July" : (num == 8) ? "August" : (num == 9) ? "September"
                : (num == 10) ? "October" : (num == 11) ? "November" : "December";

        System.out.println("result1 = " + result1);


    }
}
