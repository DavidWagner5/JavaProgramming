package day34_GarbageCollections_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi ;
    public static String name;

    public static ArrayList<Integer> numbers;




    public Circle(double radius){
        this.radius = radius;
        //  pi = 3.14;
    }


    static{
        // radius = 5;
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }

}
