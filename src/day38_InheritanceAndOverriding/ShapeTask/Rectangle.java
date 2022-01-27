package day38_InheritanceAndOverriding.ShapeTask;

public class Rectangle extends Shape{

    public double length;
    public double width;

    public Rectangle(double length, double width) {
        super("Rectangle");

        this.length = length;
        this.width = width;
    }

    @Override
    public double area(){
        return length*width;

    }
    @Override
    public double perimeter(){
        return length+width*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                " Area = " + area() +
                " Perimeter= " + perimeter() +
                '}';
    }
}
