package day43_OOPAbstraction.CarTask;

public final class Audi extends Car {
    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    public void start(){
        System.out.println("push the start button");
    }

    public void autoPark(){
        System.out.println(getMake() + " " + getModel()+ " has an auto park feature");

    }
}
