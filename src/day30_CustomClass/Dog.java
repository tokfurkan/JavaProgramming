package day30_CustomClass;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }

    //static verirsek bir kopya yaratılır, birden fazla object için birden fazla kopya yaratılmasını istiyoruz
    public void eat(){
        System.out.println(name + " is eating");
    }
    public void bark(){
        System.out.println(name + " is barking");
    }

    //bütün class larda olmak zorunda, yoksa print alırken hashcode verir. Hashcode alma sebebi toString olmamasıdır.
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
!!!CUSTOM CLASS YARATMADAN ÖNCE ATTRIBUTES VE ACTIONS BELİRLE!!!
Attributes:
        name, age, gender, breed, size, color
Actions:
        eat(), play(), bark()
 */
