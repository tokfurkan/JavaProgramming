package day09_IfStatements_2;

public class PosNegZero {

    public static void main(String[] args) {

        int n = 100;

        if (n > 0){
            System.out.println("Positive");
        }
        if (n < 0){
            System.out.println("Negative");
        }
        if (n == 0){
            System.out.println("Zero");
        }

        System.out.println("----------------------------------");

        int number = -98;

        if (number > 0){
            System.out.println(number + " is a positive number");
        } else if (number == 0){
            System.out.println(number + " is zero");
        } else {
            System.out.println(number + " is a negative number");
        }






    }
}
