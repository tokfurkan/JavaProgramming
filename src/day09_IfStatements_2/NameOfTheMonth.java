package day09_IfStatements_2;

public class NameOfTheMonth {

    public static void main(String[] args) {

        int num = 12;
        String month;

        if (num == 1){
            month = "January";
        } else if (num == 2){
            month = "February";
        } else if (num == 3){
            month = "March";
        } else if (num == 4){
            month = "April";
        } else if (num == 5){
            month = "May";
        } else if (num == 6){
            month = "June";
        } else if (num == 7){
            month = "July";
        } else if (num == 8){
            month = "August";
        } else if (num == 9){
            month = "September";
        } else if (num == 10){
            month = "October";
        } else if (num == 11){
            month = "November";
        } else {
            month = "December";
        }

        System.out.println("month = " + month);




    }
}
