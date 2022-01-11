package day35_OOPEncapsulation;

import java.util.ArrayList;
import java.util.Arrays;

/*1. CandiesTask
         1.1 Create a custom class named Candy
                private variables:
                    brand (String), quantity (int), price (double), hasPeanuts (boolean)

                Encapsulate All the private fields
                        (price of candy can not be set to negative)
                        (quantity of candy can not be set to zero or negative)

                Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

                Extra methods:
                    toString():
                        if the price is zero, print "free" instead of 0

        1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy */
public class Candy {
    //private variables
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    //extra contructor

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
        this.hasPeanuts = hasPeanuts;
    }
    //to access and modify private variables

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.err.println("Invalid Quantity");
        }
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Invalid quantity");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public String toString() {
        if (price == 0) {
            System.out.println("free candy");
        }
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price= $" + price +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }


    public static void main(String[] args) {
        Candy candy1 = new Candy("Dove", 2, 1, false);
        Candy candy2 = new Candy("Nestle", 5, 2, false);
        Candy candy3 = new Candy("Kitkat", 7, 3, false);
        Candy candy4 = new Candy("Skittles", 8, 4, true);
        Candy candy5 = new Candy("M&M", 6, 4, true);

        ArrayList<Candy> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        for (Candy each : candies) {
            System.out.println(each.getBrand()+each.getPrice());

        }
    }


}


