package day28_ArrayList;

public class StrongPassword {

    public static void main(String[] args) {

        String password = "Cydeo1990@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; // has lower case
        boolean r4 = false; // has special char
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray();
        for (char each : chars) {
            if (Character.isUpperCase(each)){
                r2 = true;
            } else if (Character.isLowerCase(each)){
                r3 = true;
            }else if (Character.isDigit(each)){
                r5 = true;
            } else { //special char
                r4 = true;
            }
            if (r2 && r3 && r4 && r5){
                break;
            }
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        System.out.println("isStrongPassword = " + isStrongPassword);




    }
    public static boolean isStrongPassword(String password){
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; // has lower case
        boolean r4 = false; // has special char
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray();
        for (char each : chars) {
            if (Character.isUpperCase(each)){
                r2 = true;
            } else if (Character.isLowerCase(each)){
                r3 = true;
            }else if (Character.isDigit(each)){
                r5 = true;
            } else { //special char
                r4 = true;
            }
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;

    }
}
/*
Write a program that can verify if a password is a strong password.
Characteristics of a stron password:
    1. Must be at least 8 characters long, and should not contain space
    2. Should at least contain one upper case letter
    3. Should at least contain one lower case letter
    4. Should at least contain one special character
    5. Should at least contain a digit

 */
