package day45_Abstraction;

public abstract class PropertiesOfInterface {


    //since interface is not a class, it cannot have instance variables. Variables are static & final by default in interfaces
    int a;
    static int b;

    public PropertiesOfInterface(int a){ //constructors are used for creating objects, we never need to create objects from interface
        this.a = a;
    }

    static { //static block runs first in the class, and gets executed when the class is loaded. This is why we cannot have it in the interface
        b = 100;
    }

    public void method1(){ //to use instance methods, we need to have objects, and interfaces cannot have objects, so we cannot use instance methods in interfaces
        System.out.println("Instance method");
    }

    public static void method2(){
        System.out.println("Static method");
    }

    public abstract void method3();

    //public default void method4(){
        //System.out.println("Default method");
    //}



}


