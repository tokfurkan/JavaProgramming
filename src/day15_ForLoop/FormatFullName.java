package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {

        String firstName = "cyDEo";
        String lastName = "SCHOOL";

        //firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println(firstName + " " + lastName);







    }
}
