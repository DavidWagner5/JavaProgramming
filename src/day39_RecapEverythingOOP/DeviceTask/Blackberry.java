package day39_RecapEverythingOOP.DeviceTask;

public class Blackberry extends Phone {
    public Blackberry(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("blackberry", model, price, hasBattery, hasPowerButton);
    }

    public void obsolete(){
        System.out.println(getBrand()+ " " + getModel()+ " is obsolete");
    }
}
