package day39_RecapEverythingOOP.DeviceTask;

public class Desktop extends Computer{
    public Desktop(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void turnOnMonitor(){
        System.out.println(getModel()+ " is turning on monitor");
    }
}
