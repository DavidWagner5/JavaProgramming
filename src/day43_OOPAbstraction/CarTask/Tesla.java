package day43_OOPAbstraction.CarTask;

public final class Tesla extends Car{


    public Tesla( String model, String color, int year, double price) {
        super("tesla", model, color, year, price);

    }


    public void start(){
        System.out.println("Voice control start");
    }

   public void autoPilot(){
       System.out.println("Tesla autopilot engaged");
   }


}
