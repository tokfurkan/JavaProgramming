package day39_Recap.shapeTask;

public class Rectangle {

    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {

        if (length <= 0){
            System.err.println("Invalid Length: " + length);
            System.exit(1);
        }

        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        if (width <= 0){
            System.err.println("Invalid Width: " + width);
            System.exit(1);
        }

        this.width = width;
    }
}
