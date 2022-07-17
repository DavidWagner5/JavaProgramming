package day44_45_OOPAbstraction_Interface.ShapeTask;

public class Sphere extends Shape implements Volume{

    private double radius;
    public final static double pi = 3.14;

    public Sphere( double radius) {
        super("Sphere");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0) throw new RuntimeException("invalid " + radius);
        this.radius = radius;
    }
    //add variables
    //add constructor
    //add getter/setter


    @Override
    public double area() {
        return 4*pi*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public double volume() {
        return 4/3*pi*radius*radius;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                "volume=" + volume() +
                '}';
    }
}
