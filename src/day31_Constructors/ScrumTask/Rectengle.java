package day31_Constructors.ScrumTask;

public class Rectengle {

    public double length, width;

    public Rectengle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
        return length * width;
    }

    public double calcPerimeter(){
        return 2 * (length+width);
    }

    public String toString() {
        return "Rectengle{" +
                "length=" + length +
                ", width=" + width +
                ", perimeter=" + calcPerimeter() +
                ", area=" + calcArea() +
                '}';
    }
}
