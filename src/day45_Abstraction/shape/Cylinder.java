package day45_Abstraction.shape;

public class Cylinder extends Shape{
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public Cylinder(String name) {
        super(name);
    }
}
