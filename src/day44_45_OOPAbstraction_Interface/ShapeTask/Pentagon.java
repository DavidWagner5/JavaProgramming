package day44_45_OOPAbstraction_Interface.ShapeTask;

public class Pentagon extends Shape implements Volume {


    private double side;
    private double height;
    private double length;

    public Pentagon( double side, double height, double length) {
        super("Pentagon");
        this.side = side;
        this.height = height;
        this.length = length;
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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return (Math.sqrt(5*(5+2*(Math.sqrt(5))))*side*side)/4;
    }

    @Override
    public double perimeter() {
        return side*5;
    }

    @Override
    public double volume() {
        return 5/2*(length*side*height);
    }

    @Override
    public String toString() {
        return "Pentagon{" +
                super.toString() +
                "side=" + side +
                ", height=" + height +
                ", length=" + length +
                ", volume=" + volume() +
                '}';
    }
}
