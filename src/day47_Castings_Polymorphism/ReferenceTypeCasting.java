package day47_Castings_Polymorphism;

import day43_OOPAbstraction.employeeTask.Employee;
import day43_OOPAbstraction.employeeTask.Tester;
import day44_45_OOPAbstraction_Interface.AnimalTask.Animal;
import day44_45_OOPAbstraction_Interface.AnimalTask.Dog;
import day44_45_OOPAbstraction_Interface.ShapeTask.Circle;
import day44_45_OOPAbstraction_Interface.ShapeTask.Shape;

import java.sql.Driver;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        // Shape shape = new Circle("4")   This is called upcasting, it is done implicitly.


       //Animal animal = new Dog("Sully")
        //Dog dog = (Dog) animal;     //Downcasting, and now you can access all of the dogs methods and characteristics to that class



        Employee employee = new Tester("David", 24, 'M', 114572, "SDET", 125000);
        // employee.bugReport(); cannot call this because we referenced employee

        ((Tester)employee).bugReport(); // so here is the downcast











    }

}
