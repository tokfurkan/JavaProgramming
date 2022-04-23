package day10_NestedIf;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        int s = 5;

        String result1 = (s >= 0 && s <= 100) ? (s >= 60) ? "Passed" : "Failed" : "Invalid Score";

        System.out.println("result1 = " + result1);


    }
}
