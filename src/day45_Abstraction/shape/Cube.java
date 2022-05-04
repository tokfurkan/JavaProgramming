package day45_Abstraction.shape;

public class Cube extends Shape{
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public Cube(String name) {
        super(name);
    }
}
