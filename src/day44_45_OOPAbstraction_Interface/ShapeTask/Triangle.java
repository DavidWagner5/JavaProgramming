package day44_45_OOPAbstraction_Interface.ShapeTask;

public class Triangle extends Shape {
    private double side;
    private double height;
    private double base;

    public Triangle(double side, double height, double base) {
        super("Triangle");
        this.side = side;
        this.height = height;
        this.base = base;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double area() {
        return 12*base*height;
    }

    @Override
    public double perimeter() {
        return side + side +base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                super.toString() +
                "side=" + side +
                ", height=" + height +
                ", base=" + base +
                '}';
    }
}
