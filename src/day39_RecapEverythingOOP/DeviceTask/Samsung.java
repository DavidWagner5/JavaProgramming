package day39_RecapEverythingOOP.DeviceTask;

public class Samsung extends Phone {
    public Samsung(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Samsung", model, price, hasBattery, hasPowerButton);
    }

    public void freeze(){
        System.out.println(getModel()+ " is freezing");
    }

}
