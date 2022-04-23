package day24_CustomMethod_Return;

public class WarmupTasks {

    public static void main(String[] args) {

        initials("Furkan", "Tök");
        System.out.println("-------------------------------");
        domain("furkan.tok@gmail.com");
        System.out.println("-------------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        for (String email : emails) {
            domain(email);
        }
        System.out.println("-------------------------------");
        nameOfMonth(8);

    }

    //create a method that can display the initials of a person
    public static void initials(String firstName, String lastName){
        String inital = firstName.charAt(0) + "." + lastName.charAt(0);
        inital = inital.toUpperCase();
        System.out.println("inital = " + inital);
    }
    //create a method that can display the domain of the email
    public static void domain(String email){
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }
    //create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){
        String name = "";

        if (number >= 1 && number <= 12){
            name = (number == 1)? "Jan" :(number == 2)? "Feb" :(number == 3)? "Mar" :(number == 4)? "Apr"
                    :(number == 5)? "May" :(number == 6)? "Jun" :(number == 7)? "Jul" :(number == 8)? "Aug"
                    :(number == 9)? "Sep" :(number == 10)? "Oct" :(number == 11)? "Nov" : "Dec";
        } else {
            name = "Invalid";
        }
        System.out.println("Month name: " + name);
    }
    //create a method that can print the name of the day based on the given number to the method

    //create a method that can print how many days a month has

    //ageGroups()


}




