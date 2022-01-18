package day39_RecapEverythingOOP.DeviceTask;
/*3. Create a subclass of Device named Computer:

				Add the extra methods if needed */
public class Computer extends Device {

    public Computer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void restore(){
        System.out.println(getBrand()+ " " + getModel() + " is running a system restore");
    }
}
