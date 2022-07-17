package day44_45_OOPAbstraction_Interface.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(2.0);
        circle1.setRadius(4.0);
        System.out.println(circle1);

        //instance of keyword
        boolean isCircle = circle1 instanceof Circle;
              System.out.println(isCircle);

        Cube cube1 = new Cube(5);
        System.out.println(cube1);

        Cylinder cylinder1 = new Cylinder(2.5, 5.0);
        System.out.println(cylinder1);

        Pentagon pentagon1 = new Pentagon(3, 8, 15);
        System.out.println(pentagon1);

        Rectangle rectangle1 = new Rectangle(5, 10);
        System.out.println(rectangle1);

        Sphere sphere1 = new Sphere(4.5);
        System.out.println(sphere1);

        square square1 = new square(4);
        System.out.println(square1);

        Triangle triangle1 = new Triangle(5,4.3, 6);
        System.out.println(triangle1);





    }

}
