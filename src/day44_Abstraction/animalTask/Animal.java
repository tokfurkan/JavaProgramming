package day44_Abstraction.animalTask;

public abstract class Animal {

    //variables
    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    //static variable
    public final static boolean canBreath;

    //static block
    static {
        canBreath = true;
    }

    //constructor
    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;
        if (!(gender == 'M' || gender == 'F')){
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            throw new RuntimeException("Invalid name: " + name);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    @Override //toString method
    public String toString() {
        return getClass().getName() + "{" + //it will replace the parent class name with the current class name while compiling.
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    //methods
    public final void drink(){
        System.out.println(name + " is drinking water");
    }
    public abstract void eat();



}
