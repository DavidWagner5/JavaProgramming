package day37_Inheritance.PhoneTask;

public final class Iphone extends Phone {


    public Iphone(String color, String size, String model, double price) {

        super("Apple", color, size, model, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " " + " is having a Face Time with phone number: " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + " is having a Face Time with email: " + email);
    }
}
