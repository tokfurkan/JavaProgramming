package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        String [] myGroup = new String[5];

        myGroup[0] = "Furkan";
        myGroup[1] = "Cem";
        myGroup[2] = "Özün";
        myGroup[3] = "Kuz";
        myGroup[4] = "Zelal";

        //System.out.println(myGroup); //hashcode

        System.out.println(Arrays.toString(myGroup));

        System.out.println("---------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int number = 5;

        if (number < 1 || number > 7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number - 1]);

        System.out.println("-------------------------------------");

        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
        "October", "November", "December"};

        int number2 = 8;

        if (number2 < 1 || number2 > 12){
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        System.out.println(months [number2 - 1]);

    }
}
