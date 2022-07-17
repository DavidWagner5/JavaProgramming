package day44_45_OOPAbstraction_Interface.ShapeTask;

public abstract class Shape {

    private final String name; //final variable, so we don't need a setter

    public Shape(String name) { //constructor
        this.name = name;
    }

    public String getName() {  //getter
        return name;
    }

    public abstract double area(); //abstract method

    public abstract double perimeter(); //abstract method

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +   //this method you can make it easier for yourself
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
