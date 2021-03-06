package day47_Polymorphism;

import day43_Abstraction.employeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Cube;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        //Shape shape = (Shape) new Circle(4); //upcasting (done implicitly)

        Shape shape2 = new Circle(5);

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        //Dog dog = (Dog) animal; //downcasting
        //dog.bark();

        //animal.bark(); we cannot call due to polymorphism rules

        System.out.println(animal.getName());
        //System.out.println(dog.getName());

        (   (Dog)animal ).bark();

        Shape shape1 = new Square("Square",5);

        System.out.println( ((Square) shape1).getSide() );

        System.out.println("------------------------------------------");

        Animal animal2 = new Cat("Jim", "Scottish", 'M', 3, "Small", "White");

        //Cat cat = ((Cat) animal2);
        //cat.meow();

        ((Cat) animal2).meow();

        System.out.println("--------------------------------------");

        Employee employee = new Tester("Ali", 30, 'M', 42, "SDET", 110000);
        ((Tester) employee).bugReport();

        //((Developer) employee).unitTest(); ClassCastException

        //Driver driver = (Driver) employee; ClassCastException
        Person person = (Person) employee;
        //Teacher teacher = (Teacher) employee; ClassCastException

        System.out.println("--------------------------------------");

        Shape s1 = new Circle(10);

        s1.area();
        s1.perimeter();
        //s1.volume();













    }

}
