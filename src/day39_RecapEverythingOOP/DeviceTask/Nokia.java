package day39_RecapEverythingOOP.DeviceTask;

public class Nokia extends Phone{



    public Nokia(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Nokia", model, price, hasBattery, hasPowerButton);
    }

    public void Update(){
        System.out.println(getModel()+ " is running a fast security update");
    }


}
