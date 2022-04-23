package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day30_CustomClass.Student;
import day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        String str = "Wooden Spoon"; //after line 8, "wooden spoon" will be eligible for garbage collector
        str = null;

        System.out.println(str);

        Car car1 = new Car("Toyota");

        car1 = null;

        System.out.println(car1);

        System.out.println("----------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1 = new Dog();
        dog1.name = "Max";

        System.out.println(dog1);

        System.out.println("-----------------------------");

        String language = "Python"; //eligible for garbage collection after line 34
        language = "Java";

        System.out.println(language);

        System.out.println("------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);

        System.out.println("-------------------------------");






    }
}
