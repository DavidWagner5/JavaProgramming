package day37_Inheritance.PhoneTask;

public class Samsung extends Phone{


    public Samsung( String color, String size, String model, double price) {
        super("Samsung", color, size, model, price);
    }

    public void freeze() {
        System.out.println(brand + " " + model + " is freezing");
    }

}


