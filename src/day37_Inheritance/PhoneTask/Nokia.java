package day37_Inheritance.PhoneTask;

public class Nokia extends Phone {
    public Nokia( String color, String size, String model, double price) {
        super( "Nokia", color, size, model, price);


    }


    public void selfDefense(){
        System.out.println("You can use "+brand+" "+model+" as self defense tool");
    }
}
