package day12_Scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your score: ");
        
        int grade = scan.nextInt();
        String result = "";

        /*
        90-100: excellent
        80-89: great
        70-79: good
        60-69: passed
        0-59: failed
         */

        if (grade >= 1 && grade <= 100){

            if (grade >= 90){
                result = "Excellent";
            } else if (grade >= 80){
                result = "Great";
            } else if (grade >= 70){
                result = "Good";
            } else if (grade >= 60){
                result = "Passed";
            } else {
                result = "Failed";
            }

        } else {
            result = "Invalid Score";
        }

        System.out.println(result);
        scan.close();
        
        
    }
}
