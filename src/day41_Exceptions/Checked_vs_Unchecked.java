package day41_Exceptions;

import day30_CustomClass.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {


        //unchecked exception

        int a = 10;
        int b = 0;

        //System.out.println(a / b); Arithmetic Exception
        //System.out.println("Wooden Spoon");

        char[] characters = {'A', 'B', 'C'};
        //System.out.println(characters[99]); Array Index out of Bounds Exception

        Student student = null;
        //System.out.println(student.name); Null Pointer Exception

        String str = "Wooden Spoon";
        str = null; //becomes eligible to be selected by garbage collector
        //System.out.println(str.toUpperCase()); Null Pointer Exception

        String str2 = ""; //object != null
        //System.out.println(str2.isEmpty());

        System.out.println("----------------------------------");

        //checked exception

        System.out.println("Hello");

        //Thread.sleep(3000); checked exception

        System.out.println("Cydeo");

        //FileInputStream file = new FileInputStream("path of the file"); checked exception

        //System.out.println("java".charAt(2000)); unchecked exception









    }


}
