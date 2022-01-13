package day38_InheritanceAndOverriding.CarTask;

public class BMW extends Car{

    public BMW(String brand, String model, int year, double pride, String color, int miles) {
        super("BMW", model, year, pride, color, miles);
    }


    public void breakDown(){
        System.out.println(brand + " " + model + " is breaking down");
    }

    public void racing(){
        System.out.println(brand+ " " + model + " is racing");
    }
}
