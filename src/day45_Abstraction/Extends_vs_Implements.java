package day45_Abstraction;

//extends:
class C{

}

class A{

}

//class B extends A, C{} multiple inheritence not allowed between classes

interface Z{

}

interface X{

}

interface Y extends X, Z{
    //multiple inheritance is allowed in interfaces
}

//implements
class D implements X, Y, Z{

}
//interfaces can never inherit from classes



public class Extends_vs_Implements {



}
