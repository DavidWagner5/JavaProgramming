package day38_InheritanceAndOverriding.ShapeTask;

public class Square extends Shape {

    public double side;
    public Square(double side) {
        super("Square");
        this.side = side;
    }


    @Override public double area() {
        return side*side;
    }
    @Override
    public double perimeter() {
        return side*4;
    }
    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", side=" + side +
                " Area = " + area() +
                " Perimeter= " + perimeter() +
                '}';
    }


}
