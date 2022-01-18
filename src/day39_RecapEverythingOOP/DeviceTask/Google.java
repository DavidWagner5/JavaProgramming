package day39_RecapEverythingOOP.DeviceTask;

public class Google extends Phone {
    public Google( String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("google", model, price, hasBattery, hasPowerButton);

    }

    public void logsIntoGoogleAccount(){
        System.out.println(getModel()+ " logs into google account");
    }
}

