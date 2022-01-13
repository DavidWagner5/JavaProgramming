package day38_Inheritance.CarTask;

public class Toyota extends Car {


    public Toyota(String brand, String model, int year, double pride, String color, int miles) {
        super("Toyota", model, year, pride, color, miles);
    }


    public void reliable(){
        System.out.println(brand+ " " + model + " is reliable");
    }


}
