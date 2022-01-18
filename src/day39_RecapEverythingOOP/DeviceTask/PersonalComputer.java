package day39_RecapEverythingOOP.DeviceTask;

public class PersonalComputer extends Computer{
    public PersonalComputer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }


    public void playGames(){
        System.out.println(getModel()+ " is launching fortnite");
    }

    public void studying(){
        System.out.println(getModel()+ " is launching Cydeo canvas");
    }


}
