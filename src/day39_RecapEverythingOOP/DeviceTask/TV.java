package day39_RecapEverythingOOP.DeviceTask;
/*4. Create a sub class of Device named TV:

				Extra Methods:
					channelUp()
					channelDown() */
public class TV extends Device{
    public TV(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void channelUp(){
        System.out.println(getBrand()+ " " + getModel() + " is going up a channel");
    }

    public void channelDown(){
        System.out.println(getBrand()+ " " + getModel() + " is going down a channel");
    }
}
