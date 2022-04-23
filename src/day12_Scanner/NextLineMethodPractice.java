package day12_Scanner;

import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        input.nextLine(); //to clear the scanner memory before using nextLine method

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA: ");
        double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your school: ");
        String school = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("school = " + school);

        input.close();


    }
}
