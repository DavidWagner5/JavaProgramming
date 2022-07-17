package day43_OOPAbstraction.CarTask;

import day25_CustomMethodOverloading.AddElementsToArray2;

public class CarObjects {


    public static void main(String[] args) {

       // Car car1 = new Car("Cydeo", "25", "blue", 2022, 100000)
        //we cannot create an object from abstract class

        Honda honda = new Honda("Accord", "Black", 2019, 30000);

        Audi audi = new Audi("Q7", "Blue", 2020, 45000);

        Tesla tesla = new Tesla("Model3", "White", 2021, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


        System.out.println("------------------------------------------------------------");

        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Green");

        honda.setPrice(25000);
        audi.setPrice(40000);
        tesla.setPrice(55000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
    }
}
