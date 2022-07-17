package day44_45_OOPAbstraction_Interface.ShapeTask;

public class square extends Shape {

    private double side;

    public square(double side) {
        super("square");
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side+side *2;
    }

    @Override
    public String toString() {
        return "square{" +
                super.toString()+
                "side=" + side +
                '}';
    }
}
