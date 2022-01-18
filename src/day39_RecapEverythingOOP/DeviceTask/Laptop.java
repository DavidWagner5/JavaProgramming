package day39_RecapEverythingOOP.DeviceTask;

public class Laptop extends Computer{
    public Laptop(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void videoChat(){
        System.out.println(getModel()+ " is launching video chat");
    }
}
