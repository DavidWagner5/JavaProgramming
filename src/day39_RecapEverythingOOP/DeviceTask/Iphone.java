package day39_RecapEverythingOOP.DeviceTask;
/*5. Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone
				2. Samsung
				3. BlackBerry
				4. Google
				5. Nokia*/
public class Iphone extends Phone {
    public Iphone(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("iPhone", model, price, hasBattery, hasPowerButton);
    }

    public void faceTime(){
        System.out.println(getModel() + " is calling by facetime");
    }
}
