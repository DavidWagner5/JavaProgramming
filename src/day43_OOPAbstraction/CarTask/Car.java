package day43_OOPAbstraction.CarTask;
//the class must be abstract because the methods that can be overriden have a different functionality for different cars, (implementation).
public abstract class Car {

    private final String make, model;
    private String color;
    private final int year;
    private double price;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;

        if(price <= 0){
            throw new RuntimeException("invalid price");
        }
    }

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        setColor(color);

        if(year<=1970){
            throw new RuntimeException("invalid year");
        }
        this.year = year;
        setPrice(price);
    }

    public  void stop(){
        System.out.println("Press the brake");
    }

    public abstract void start();


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

