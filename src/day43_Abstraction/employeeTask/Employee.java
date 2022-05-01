package day43_Abstraction.employeeTask;

public abstract class Employee extends Person {

    //variables
    private final int id;
    private String jobTitle;
    private double salary;

    //parent class' constructor
    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        if (id <= 0){
            throw new RuntimeException("Invalid ID: " + id);
        }
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //abstract method
    public abstract void work();

    @Override //overridden toString
    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
