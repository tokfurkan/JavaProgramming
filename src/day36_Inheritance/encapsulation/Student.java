package day36_Inheritance.encapsulation;

public class Student {

    private String name, schoolName;
    private int age;
    private char gender, grade;

    public String getName() {
        return name;
    }

    public void setName(String student) {
        this.name = student;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 5 || age > 90){
            return;
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'F' || gender == 'M')){
            return;
        }

        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')){
            return;
        }

        this.grade = grade;
    }

    public Student(String name, String schoolName, int age, char gender, char grade) {
        setName(name);
        setSchoolName(schoolName);
        setAge(age);
        setGender(gender);
        setGrade(grade);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }

    public void study(){
        System.out.println(name + " is studying");
    }

}

