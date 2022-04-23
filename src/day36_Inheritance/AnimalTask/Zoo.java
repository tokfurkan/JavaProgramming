package day36_Inheritance.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "Small", "white");
        dog.sleep();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        //dog.hunt();
        //dog.scratch();
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarçın", "british", 'M', 3, "small", "brown");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        //cat.bark();
        //cat.hunt();
        cat.scratch();

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "large", "red");
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.hunt();
        tiger.roar();
        //tiger.bark();







    }



}
