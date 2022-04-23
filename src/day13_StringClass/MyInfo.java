package day13_StringClass;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Enter your gender: ");
        String gender = scan.next();

        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your phone number: ");
        long phoneNumber = scan.nextLong();

        System.out.println("Enter your zip code: ");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your school name: ");
        String school = scan.nextLine();

        System.out.println("Enter your city name: ");
        String city = scan.nextLine();

        System.out.println("Enter your state name: ");
        String state = scan.next();

        System.out.println("Enter your building number: ");
        int building = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street name: ");
        String street = scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("Address: \n\t" + building + " " + street + "\n\t" + city + ", " + state + " " + zipCode);
        System.out.println("school = " + school);




    }
}
