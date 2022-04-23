package day11_SwitchScanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 5;

        switch (number){ //1, 2, 3, 4, 5, 6, 7
        // switch statement only can be used when comparing the datas if they're equal or not
        // switch is more powerful and faster
        // we can use if statements for every single switch application but not vice versa
        // here, compiler doesnt go over every cases, it directly runs the matched case block, this is why it is faster than if
        // switch case only stops when it sees a break; or reaches the closing curly braces
            case 1:
                System.out.println("Monday");
                break; //exits the switch after executing the case block

            case 2:
                System.out.println("Tuesday");
                break; //exits the switch after executing the case block

            case 3:
                System.out.println("Wednesday");
                break; //exits the switch after executing the case block

            case 4:
                System.out.println("Thursday");
                break; //exits the switch after executing the case block

            case 5:
                System.out.println("Friday");
                break; //exits the switch after executing the case block

            case 6:
                System.out.println("Saturday");
                break; //exits the switch after executing the case block

            case 7:
                System.out.println("Sunday");
                break; //exits the switch after executing the case block

            default: //only gets executed if none of the case blocks are matching
                System.out.println("Invalid number");
        }






    }
}
