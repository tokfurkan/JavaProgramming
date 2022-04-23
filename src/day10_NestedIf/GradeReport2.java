package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

        int score = 70;

        if (score >= 0 && score <= 100){

            if (score >= 90){
                System.out.println("Excellent");
            } else if (score >= 80){
                System.out.println("Great");
            } else if (score >= 70){
                System.out.println("Good");
            } else if (score >= 60){
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        } else {
            System.out.println("Invalid score");
        }

        String result = (score >= 0 && score <= 100) ? (score >= 90) ? "Excellent" : (score >= 80) ? "Great"
                : (score >= 70) ? "Good" : (score >= 60) ? "Passed" : "Failed" : "Invalid score";
        System.out.println("result = " + result);





    }
}
