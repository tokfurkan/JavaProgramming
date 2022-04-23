package day32_Constructor;

public class Employee {

    public String name, jobTitle;
    public char gender;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle) {
        this(name, gender);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, char gender, double salary) {
        this(name, gender, jobTitle);
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
