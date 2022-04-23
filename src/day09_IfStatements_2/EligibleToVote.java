package day09_IfStatements_2;

public class EligibleToVote {

    public static void main(String[] args) {

        int age = 18;
        String citizenship = "TR";

        if (age > 25 && citizenship == "USA"){
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are NOT eligible to vote");
        }



    }
}
