package day34_GarbageCollection_AccessModifiers;

import org.w3c.dom.ls.LSOutput;

public class CydeoStudent {

    public String studentName;
    public static String schoolName;

    public CydeoStudent(String studentName){

        this.studentName = studentName;
        schoolName = "Cydeo School";

    }

}

class CydeoStudentObjects{

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Jimmy");
        CydeoStudent student2 = new CydeoStudent("Kathy");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

    }





}
