package day37_Inheritance.PhoneTask;

public class Phone {


    public String brand, color, size, model;
    public double price;

    public static boolean hasBattery;

    public Phone(String brand, String color, String size, String model, double price) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.model = model;
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(brand+ " " + model + " is calling" + phoneNumber);
    }
    public void test(long phoneNumber){
        System.out.println(brand + " " + model+ " is texting" + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                '}';
    }
}
