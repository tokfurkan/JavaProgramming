package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine(); //it only stops when we hit the enter

        System.out.println("Enter your Programming Language: ");
        String programming = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine(); // it will take out the enter from the scanner's memory

        System.out.println("Enter your school name: ");
        String school = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("school = " + school);

    }
}
