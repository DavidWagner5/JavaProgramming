package day44_45_OOPAbstraction_Interface.ShapeTask;

public class Cube extends Shape implements Volume {


   private double faces;

    public Cube( double faces) {
        super("Cube");
        this.faces = faces;
    }


    public double getFaces() {
        return faces;
    }

    public void setFaces(double faces) {
        this.faces = faces;
    }

    @Override
    public double area() {
        return 6*faces*faces;
    }

    @Override
    public double perimeter() {
        return 12*faces;
    }

    @Override
    public double volume() {
        return faces*faces*faces;
    }

    @Override
    public String toString() {
        return "Cube{" +
                super.toString() +
                "faces=" + faces +
                "volume=" + volume() +
                '}';
    }
}
