package day38_InheritanceAndOverriding.CarTask;

public class Tesla extends Car {
    public Tesla(String brand, String model, int year, double pride, String color, int miles) {
        super("Tesla", model, year, pride, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand + " " + model + " in autopilot mode");
    }
}
