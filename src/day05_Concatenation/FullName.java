package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Furkan";
        String lastName = "Tök";
        int age = 21;
        String jobTitle = "SDET";
        String companyName = "Cydeo";
        double salary = 100_000.58;

        String fullName = firstName + " " + lastName;

        //full name of the person is ___
        System.out.println("Full name of the person is " + fullName);

        //___ is ___ years old
        System.out.println(fullName + " is " + age + " years old.");

        //fullName is jobTitle at companyName, and fullName's salary is salary.
        System.out.println(fullName + " is " + jobTitle + " at " + companyName + ", and "
                + fullName + "'s salary is $" + salary);







    }
}
